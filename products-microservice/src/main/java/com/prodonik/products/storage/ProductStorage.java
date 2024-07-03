package com.prodonik.products.storage;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.prodonik.genprotos.Products.GetAllProductsResponse;
import com.prodonik.genprotos.Products.GetByRequest;
import com.prodonik.genprotos.Products.GetByResponse;
import com.prodonik.genprotos.Products.Product;
import com.prodonik.products.convertor.Converter;
import com.prodonik.products.entities.EProduct;
import com.prodonik.products.errors.ProductDoesNotExsistException;
import com.prodonik.products.errors.ProductsAlreadyExistsException;
import com.prodonik.products.repo.ProductRepo;

@Service
public class ProductStorage {
    private ProductRepo productRepo;
    private Converter convertor;

    public ProductStorage(ProductRepo productRepo, Converter convertor) {
        this.productRepo = productRepo;
        this.convertor = convertor;
    }

    public Product createProduct(Product product) throws ProductsAlreadyExistsException {
        EProduct eProduct = this.convertor.convertProtoToProduct(product);
        if (this.productRepo.findByName(eProduct.getName()).isPresent()) {
            throw new ProductsAlreadyExistsException("this product is already available");
        }
        return this.convertor.convertProductToProto(this.productRepo.save(eProduct));
    }
    
    public Product updateProductById(UUID productId, Product newProduct) throws ProductDoesNotExsistException {
        EProduct eProduct = this.convertor.convertProtoToProduct(newProduct);
        if (this.productRepo.findById(productId).isPresent()) {
            eProduct.setId(productId);
            return this.convertor.convertProductToProto(this.productRepo.save(eProduct));
        }
        throw new ProductDoesNotExsistException("product has not been found");
    }

    public Product getProductById(UUID productId) throws ProductDoesNotExsistException {
        Optional<EProduct> product = this.productRepo.findById(productId);
        if (product.isPresent()) return this.convertor.convertProductToProto(product.get());
        throw new ProductDoesNotExsistException("product has not been found");
    }

    public Product getProductByName(String productName) throws ProductDoesNotExsistException {
        Optional<EProduct> product = this.productRepo.findByName(productName);
        if (product.isPresent()) return this.convertor.convertProductToProto(product.get());
        throw new ProductDoesNotExsistException("product has not been found");
    }

    public void deleteProductById(UUID productId) throws ProductDoesNotExsistException {
        Optional<EProduct> product = this.productRepo.findById(productId);
        if (product.isPresent()) {
            this.productRepo.deleteById(productId);
        } else {
            throw new ProductDoesNotExsistException("product has not been found");
        }
    }

    public GetAllProductsResponse getAllProducts() {
        List<EProduct> productList = productRepo.findAll();
        List<Product> grpcProducts = new ArrayList<>();
        for (int i = 0; i < productList.size(); i ++) {
            grpcProducts.add(this.convertor.convertProductToProto(productList.get(i)));
        }
        return GetAllProductsResponse.newBuilder()
                .addAllProducts(grpcProducts)
                .build();
    }

    public GetByResponse getProductsByCategoryName(GetByRequest request) {
        List<EProduct> products = this.productRepo.getProductsByCategoryName(request.getReuier());
        List<Product> response = products.stream()
                                         .map(p -> this.convertor.convertProductToProto(p))
                                         .collect(Collectors.toList());
        return GetByResponse.newBuilder()
                            .addAllProducts(response)
                            .build();
    }

    public GetByResponse getProductsByCategoryId(GetByRequest request) {
        List<EProduct> products = this.productRepo.getProductsByCategoryId(
            UUID.fromString(request.getReuier())
        );
        List<Product> response = products.stream()
                                         .map(p -> this.convertor.convertProductToProto(p))
                                         .collect(Collectors.toList());
        return GetByResponse.newBuilder()
                            .addAllProducts(response)
                            .build();
    }
}
