package com.xlebini.Javito.services;

import com.xlebini.Javito.models.Product;
import com.xlebini.Javito.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public Optional<Product> getProductByID(UUID uuid) {
        return productRepository.findById(uuid);
    }

    public void deleteProductByID(UUID uuid) {
        if (productRepository.findById(uuid).isPresent()) {
            productRepository.deleteById(uuid);
        }
    }

    public List<Product> getAllProducts() {
//        productRepository.findAll().forEach(System.out::println);
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

}
