package rest.spa_api.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.spa_api.entity.ProductsEntity;
import rest.spa_api.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {

  @Autowired
  private final ProductsService productsService;

  public ProductsController(ProductsService productsService) {
    this.productsService = productsService;
  }


  @GetMapping("/")
  public List<ProductsEntity> getAllProducts() {
    return productsService.getAllProducts();
  }

  @GetMapping("/{id}")
  public Optional<ProductsEntity> getProductsById
      (@PathVariable(value = "id") Integer id) {
    return productsService.getProductsById(id);
  }

  @PostMapping("/")
  public ProductsEntity createProducts(@Valid @RequestBody ProductsEntity products) {
    return productsService.createProducts(products);
  }

  @PutMapping("/")
  public ProductsEntity updateProducts(@Valid @RequestBody ProductsEntity products) {
    return productsService.updateProducts(products);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Object> deleteProductsById(@PathVariable Integer id) {
    return productsService.deleteProductsById(id);
  }
}

