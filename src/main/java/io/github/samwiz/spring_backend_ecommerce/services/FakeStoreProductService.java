package io.github.samwiz.spring_backend_ecommerce.services;

import io.github.samwiz.spring_backend_ecommerce.dtos.FakeStoreProductDto;
import io.github.samwiz.spring_backend_ecommerce.models.Category;
import io.github.samwiz.spring_backend_ecommerce.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService
{
    @Override
    public Product getproductById(Long id)
    {
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto fakeStoreProductDto =  restTemplate.getForObject("https://fakestoreapi.com/products/"+ id, FakeStoreProductDto.class);
        return convertFakeStoreProductToProduct(fakeStoreProductDto);
    }
    @Override
    public List<Product> getAllProducts()
    {
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto[] fakeStoreProductDtos = restTemplate.getForObject("https://fakestoreapi.com/products", FakeStoreProductDto[].class);
        List<Product> products = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreProductDtos)
        {
            products.add(convertFakeStoreProductToProduct(fakeStoreProductDto));
        }
        return products;
    }
    @Override
    public  List<String> getAllCategories()
    {
        RestTemplate restTemplate = new RestTemplate();
        String[] categories = restTemplate.getForObject("https://fakestoreapi.com/products/categories", String[].class);
        return Arrays.asList(categories);
    }

    @Override
    public List<Product> getProductByCategory(String category)
    {
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductDto[] fakeStoreProductDtos = restTemplate.getForObject("https://fakestoreapi.com/products/category/"+category, FakeStoreProductDto[].class);
        List<Product> products = new ArrayList<>();
        for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos)
        {
            products.add(convertFakeStoreProductToProduct(fakeStoreProductDto));
        }
        return products;
    }

    private Product convertFakeStoreProductToProduct(FakeStoreProductDto fakeStoreProductDto)
    {
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImage(fakeStoreProductDto.getImage());
        Category category = new Category();
        category.setDescription(fakeStoreProductDto.getDescription());
        product.setCategory(category);
        return product;
    }
}
