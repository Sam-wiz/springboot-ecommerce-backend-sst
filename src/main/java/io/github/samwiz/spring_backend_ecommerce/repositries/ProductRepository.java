package io.github.samwiz.spring_backend_ecommerce.repositries;

import io.github.samwiz.spring_backend_ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{
    @Override
    Optional<Product> findById(Long id);

    @Override
     Product save(Product product);
}
