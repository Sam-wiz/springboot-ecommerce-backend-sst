package io.github.samwiz.spring_backend_ecommerce.controllers;

import io.github.samwiz.spring_backend_ecommerce.models.Product;
import io.github.samwiz.spring_backend_ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController
{
    private  ProductService productService;
    ProductController(@Qualifier("SelfProductService") ProductService productService)
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
    @PostMapping
    public Product createProduct(@RequestBody Product product)
    {
        return productService.createProduct(product);
    }
}
