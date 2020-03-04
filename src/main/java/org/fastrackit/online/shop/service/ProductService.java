package org.fastrackit.online.shop.service;

import org.fastrackit.online.shop.domain.Product;
import org.fastrackit.online.shop.persistance.persistance.ProductRepository;
import org.fastrackit.online.shop.transfer.SaveProductRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private static final Logger LOGGER = LoggerFactory.getLogger((ProductService.class));

// Inversion of Control(IoC)
    private final ProductRepository productRepository;

//dependency injection (from Ioc container)
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product createProduct(SaveProductRequest request) {
        LOGGER.info("Creating product {}", request);
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        product.setImageURL(request.getImageURL());

        return productRepository.save(product);

    }

}

