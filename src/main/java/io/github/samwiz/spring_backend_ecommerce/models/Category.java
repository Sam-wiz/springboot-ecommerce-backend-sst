package io.github.samwiz.spring_backend_ecommerce.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category
{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY )
    private Long id;
    private String title;
    private String description;
}
