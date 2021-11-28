package com.learn.elastic.service;

import com.learn.elastic.entity.Product;
import com.learn.elastic.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SpringDataProductServiceImpl {

    private final ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProduct(String id) {
        return productRepository.findById(id);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    public Iterable<Product> insertBulk(List<Product> products) {
        return productRepository.saveAll(products);
    }
}
