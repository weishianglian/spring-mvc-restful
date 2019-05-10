package com.example.springmvc.boot;

import com.example.springmvc.model.Product;
import com.example.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Product> products = Arrays.asList(
            new Product("Milky Bar", "Milky bar with chocolate and hazelnut", "CANDIES", "BARS", 1.99),
            new Product("Almond Bar", "Almond bar with chocolate and honey", "CANDIES", "BARS", 2.99)
        );
        products.forEach(product -> repository.save(product));
    }
}
