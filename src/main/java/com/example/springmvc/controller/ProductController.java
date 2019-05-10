package com.example.springmvc.controller;

import com.example.springmvc.model.Product;
import com.example.springmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/products/add")
    public String createProduct(Model model) {
        model.addAttribute("product", new Product());
        return "edit";
    }

    @PostMapping("/products")
    public String saveProduct(Product product) {
        repository.save(product);
        return "redirect:/";
    }

    @GetMapping("/products")
    public String getAllProducts(Model model) {
        model.addAttribute("products", repository.findAll());
        return "products";
    }

    @GetMapping("/products/edit/{id}")
    public String editProduct(Model model, @PathVariable("id") String id) {
        if (repository.existsById(id)) {
            model.addAttribute(repository.getOne(id));
        }
        return "edit";
    }

    @DeleteMapping("/products/delete/{id}")
    public String deleteProduct(Model model, @PathVariable("id") String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
        return "redirect:/products";
    }
}
