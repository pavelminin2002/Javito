package com.xlebini.Javito.controllers;

import com.xlebini.Javito.dto.ProductDTO;
import com.xlebini.Javito.models.Product;
import com.xlebini.Javito.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
@AllArgsConstructor
public class ProductsController {
    private final ProductService productService;


    @GetMapping("/")
    public String products(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @PostMapping("/product/save")
    public String saveProduct(ProductDTO productDTO) {
        productService.saveProduct(Product.builder()
                .id(productDTO.getId())
                .title(productDTO.getTitle())
                .price(productDTO.getPrice())
                .description(productDTO.getDescription())
                .build());

        return "redirect:/";
    }

    @DeleteMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable UUID id) {
        productService.deleteProductByID(id);
        return "redirect:/";
    }
}
