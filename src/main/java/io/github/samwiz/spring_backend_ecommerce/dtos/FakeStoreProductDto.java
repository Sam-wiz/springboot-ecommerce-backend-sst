package io.github.samwiz.spring_backend_ecommerce.dtos;

import io.github.samwiz.spring_backend_ecommerce.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto
{
    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}
