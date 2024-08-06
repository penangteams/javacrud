package superexample.amazingsite.services;

import org.springframework.data.jpa.repository.JpaRepository;
import superexample.amazingsite.models.Product;


public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
