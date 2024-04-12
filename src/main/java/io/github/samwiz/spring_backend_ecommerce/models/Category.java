package io.github.samwiz.spring_backend_ecommerce.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Category
{
    private Long id;
    private String title;
    private String description;
}
