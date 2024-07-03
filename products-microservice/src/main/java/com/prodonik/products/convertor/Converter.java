package com.prodonik.products.convertor;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.prodonik.genprotos.Products.Category;
import com.prodonik.genprotos.Products.Product;
import com.prodonik.products.entities.ECategory;
import com.prodonik.products.entities.EProduct;

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
        return product;
    }

    public ECategory convertProtoToCategory(Category protoCategory) {
        ECategory category = new ECategory();
        category.setId(UUID.fromString(protoCategory.getId()));
        category.setName(protoCategory.getName());
        category.setDescription(protoCategory.getDescription() != null ? protoCategory.getDescription().getValue() : null);

        Set<EProduct> products = new HashSet<>();
        for (Product protoProduct : protoCategory.getProductsList()) {
            products.add(convertProtoToProduct(protoProduct));
        }

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
                .setStockQuantity(product.getStockQuantity());

        return builder.build();
    }

    public Category convertCategoryToProto(ECategory category) {
        Category.Builder builder = Category.newBuilder()
                .setId(category.getId().toString())
                .setName(category.getName())
                .setDescription(category.getDescription() != null ?
                        com.google.protobuf.StringValue.newBuilder().setValue(category.getDescription()).build() : null);

        return builder.build();
    }
}
