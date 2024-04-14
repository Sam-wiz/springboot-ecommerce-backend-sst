package io.github.samwiz.spring_backend_ecommerce.services;

import io.github.samwiz.spring_backend_ecommerce.exceptions.ProductNotFoundException;
import io.github.samwiz.spring_backend_ecommerce.models.Category;
import io.github.samwiz.spring_backend_ecommerce.models.Product;
import io.github.samwiz.spring_backend_ecommerce.repositries.CategoryRepository;
import io.github.samwiz.spring_backend_ecommerce.repositries.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("SelfProductService")
public class SelfProductService implements ProductService
{
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository)
    {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    @Override
    public Product getproductById(Long id)
    {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isEmpty())
        {
            throw new ProductNotFoundException("Product not found");

        }
        Product product = optionalProduct.get();
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public List<String> getAllCategories() {
        return null;
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return null;
    }

    @Override
    public Product createProduct(Product product)
    {
        Category category = product.getCategory();
        if(category.getId() == null)
        {
            product.setCategory(categoryRepository.save(category));
        }
        return productRepository.save(product);
    }
}
