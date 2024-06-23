package uz.pdp.networking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.pdp.networking.model.Product;
import uz.pdp.networking.model.enumerator.ProductCategory;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);

    @Query("SELECT p FROM Product p WHERE p.category = :category ORDER BY p.name ASC")
    List<Product> findByCategory(ProductCategory category);
}
