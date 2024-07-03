package com.prodonik.products.convertor;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.google.protobuf.Timestamp;
import com.prodonik.genprotos.Products.Category;
import com.prodonik.genprotos.Products.CreateProductsHistoryRequest;
import com.prodonik.genprotos.Products.CreateProductsHistoryResponse;
import com.prodonik.genprotos.Products.Product;
import com.prodonik.products.entities.ECategory;
import com.prodonik.products.entities.EHistory;
import com.prodonik.products.entities.EProduct;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class Converter {
    public EProduct convertProtoToProduct(Product protoProduct) {
        EProduct product = new EProduct();
        product.setId(UUID.fromString(protoProduct.getId()));
        product.setName(protoProduct.getName());
        product.setDescription(protoProduct.getDescription() != null ? protoProduct.getDescription().getValue() : null);
        product.setPrice(BigDecimal.valueOf(protoProduct.getPrice()));
        product.setStockQuantity(protoProduct.getStockQuantity());
        product.setCategoryId(UUID.fromString(protoProduct.getCategoryId()));
        product.setSellerId(UUID.fromString(protoProduct.getSellerId()));
        return product;
    }

    public ECategory convertProtoToCategory(Category protoCategory) {
        ECategory category = new ECategory();
        category.setName(protoCategory.getName());
        category.setDescription(protoCategory.getDescription() != null ? protoCategory.getDescription().getValue() : null);

        return category;
    }

    public Product convertProductToProto(EProduct product) {
        Product.Builder builder = Product.newBuilder()
                .setId(product.getId().toString())
                .setName(product.getName())
                .setDescription(product.getDescription() != null ?
                        com.google.protobuf.StringValue.newBuilder().setValue(product.getDescription()).build() : null)
                .setPrice(product.getPrice().doubleValue())
                .setCategoryId(product.getCategoryId().toString())
                .setStockQuantity(product.getStockQuantity())
                .setSellerId(product.getSellerId().toString());

        return builder.build();
    }

    public Category convertCategoryToProto(ECategory category) {
        Category.Builder builder = Category.newBuilder()
                .setCategoryId(category.getId().toString())
                .setName(category.getName())
                .setDescription(category.getDescription() != null ?
                        com.google.protobuf.StringValue.newBuilder().setValue(category.getDescription()).build() : null);

        return builder.build();
    }

    public CreateProductsHistoryResponse EHistorytoProto(EHistory eHistort) {
        return CreateProductsHistoryResponse.newBuilder()
                .setHistoryId(eHistort.getId().toString())
                .setProductId(eHistort.getProductId().toString())
                .setNumberOfBoughtProducts(eHistort.getNumberOfBoughtProducts())
                .setClientId(eHistort.getClientId().toString())
                .setBoughtAt(
                    Timestamp.newBuilder()
                            .setSeconds(eHistort.getBoughtAt().toEpochSecond(ZoneOffset.UTC))
                            .setNanos(eHistort.getBoughtAt().getNano())
                            .build()
                )
                .build();
    }

    public EHistory protoHistoryToEntiry(CreateProductsHistoryRequest proto) {
        EHistory eHistory = new EHistory();
        eHistory.setProductId(UUID.fromString(proto.getProductId()));
        eHistory.setNumberOfBoughtProducts(proto.getNumberOfBoughtProducts());
        eHistory.setClientId(UUID.fromString(proto.getClientId()));
        eHistory.setBoughtAt(LocalDateTime.now());
        return eHistory;
    }
}
