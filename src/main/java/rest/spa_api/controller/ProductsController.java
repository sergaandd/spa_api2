package rest.spa_api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.spa_api.entity.ProductsEntity;
import rest.spa_api.repository.ProductsRepository;

@RestController
@RequestMapping("/products")
public class ProductsController {

  @Autowired
  private final ProductsRepository productsRepository;

  public ProductsController(ProductsRepository productsRepository) {
    this.productsRepository = productsRepository;
  }

  @GetMapping("/")
  public List<ProductsEntity> getAllProducts() {
    return productsRepository.findAll();
  }
}

