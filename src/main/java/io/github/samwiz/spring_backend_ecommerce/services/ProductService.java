package io.github.samwiz.spring_backend_ecommerce.services;

import io.github.samwiz.spring_backend_ecommerce.models.Category;
import io.github.samwiz.spring_backend_ecommerce.models.Product;

import java.util.List;

public interface ProductService {
   Product getproductById(Long id);
   List<Product> getAllProducts();
   List<String> getAllCategories();
   List<Product> getProductByCategory(String category);
    Product createProduct(Product product);
}
