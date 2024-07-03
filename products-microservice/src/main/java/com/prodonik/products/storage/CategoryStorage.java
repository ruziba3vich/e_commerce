package com.prodonik.products.storage;

import java.util.Optional;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prodonik.genprotos.Products.Category;
import com.prodonik.genprotos.Products.GetAllCategoriesResponse;
import com.prodonik.products.convertor.Converter;
import com.prodonik.products.entities.ECategory;
import com.prodonik.products.errors.CategoryDoesNotExsistException;
import com.prodonik.products.errors.CategoryAlreadyExistsException;
import com.prodonik.products.repo.CategoryRepo;

@Service
public class CategoryStorage {
    private final CategoryRepo categoryRepo;
    private final Converter convertor;

    public CategoryStorage(CategoryRepo categoryRepo, Converter convertor) {
        this.categoryRepo = categoryRepo;
        this.convertor = convertor;
    }

    public Category createCategory(Category category) throws CategoryAlreadyExistsException {
        ECategory eCategory = this.convertor.convertProtoToCategory(category);
        if (categoryRepo.findByName(eCategory.getName()).isPresent()) {
            throw new CategoryAlreadyExistsException("This category already exists");
        }
        return this.convertor.convertCategoryToProto(
            categoryRepo.save(eCategory)
        );
    }

    public Category updateCategoryById(UUID categoryId, Category newCategory) throws CategoryDoesNotExsistException {
        ECategory eCategory = this.convertor.convertProtoToCategory(newCategory);
        if (categoryRepo.findById(categoryId).isPresent()) {
            eCategory.setId(categoryId);
            return this.convertor.convertCategoryToProto(
                categoryRepo.save(eCategory)
            );
        }
        throw new CategoryDoesNotExsistException("Category not found");
    }

    public Category getCategoryById(UUID categoryId) throws CategoryDoesNotExsistException {
        Optional<ECategory> category = categoryRepo.findById(categoryId);
        if (category.isPresent()) {
            return this.convertor.convertCategoryToProto(
                category.get()
            );
        }
        throw new CategoryDoesNotExsistException("Category not found");
    }

    public Category getCategoryByName(String categoryName) throws CategoryDoesNotExsistException {
        Optional<ECategory> category = categoryRepo.findByName(categoryName);
        if (category.isPresent()) {
            return this.convertor.convertCategoryToProto(
                category.get()
            );
        }
        throw new CategoryDoesNotExsistException("Category not found");
    }

    public void deleteCategoryById(UUID categoryId) throws CategoryDoesNotExsistException {
        if (categoryRepo.findById(categoryId).isPresent()) {
            categoryRepo.deleteById(categoryId);
        } else {
            throw new CategoryDoesNotExsistException("Category not found");
        }
    }

    public GetAllCategoriesResponse getAllCategories() {
        List<Category> protoCategories = new ArrayList<>();
        List<ECategory> categories = this.categoryRepo.findAll();

        for (int i = 0; i < categories.size(); i ++) {
            protoCategories.add(
                this.convertor.convertCategoryToProto(
                    categories.get(i)
                )
            );
        }
        return GetAllCategoriesResponse
                            .newBuilder()
                            .addAllCategories(protoCategories)
                            .build();
    }
}
