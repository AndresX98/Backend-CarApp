package org.alopez.backend.cartapp.services;
import org.alopez.backend.cartapp.moldels.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
