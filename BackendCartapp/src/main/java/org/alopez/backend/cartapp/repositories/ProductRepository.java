package org.alopez.backend.cartapp.repositories;


import org.alopez.backend.cartapp.moldels.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
