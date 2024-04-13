package io.github.samwiz.spring_backend_ecommerce.controllers;

import io.github.samwiz.spring_backend_ecommerce.dtos.Exceptiondto;
import io.github.samwiz.spring_backend_ecommerce.models.Product;
import io.github.samwiz.spring_backend_ecommerce.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController
{
    private ProductService productService;
    ProductController(ProductService productService)
    {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public Product  getProductById(@PathVariable("id") Long id)
    {
        return productService.getproductById(id);
    }

    @GetMapping("")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }
    @GetMapping("/categories")
    public List<String> getAllCategories()
    {
        return productService.getAllCategories();
    }
    @GetMapping("/category/{category}")
    public List<Product> getProductByCategory(@PathVariable("category") String category)
    {
        return productService.getProductByCategory(category);
    }
}
