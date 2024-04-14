package io.github.samwiz.spring_backend_ecommerce.repositries;

import io.github.samwiz.spring_backend_ecommerce.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.tokens.ScalarToken;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>
{
    @Override
    Category save(Category category);
}
