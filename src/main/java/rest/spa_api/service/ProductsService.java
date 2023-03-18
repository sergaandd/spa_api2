package rest.spa_api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import rest.spa_api.entity.ProductsEntity;
import rest.spa_api.repository.ProductsRepository;
@Service
public class ProductsService {
  private final ProductsRepository productsRepository;

  public ProductsService(ProductsRepository productsRepository) {
    this.productsRepository = productsRepository;
  }

  public List<ProductsEntity> getAllProducts() {
    return productsRepository.findAll();
  }

  public Optional<ProductsEntity> getProductsById(Integer id) {
    return productsRepository.findById(id);
  }

  public ProductsEntity createProducts(ProductsEntity products) {
    if(productsRepository.findById(products.getId()).isPresent()) {
      return new ProductsEntity();
    } else { return productsRepository.save(products); }
  }

  public ProductsEntity updateProducts(ProductsEntity products) {
    if(productsRepository.findById(products.getId()).isPresent()) {
      return productsRepository.save(products);
    } else { return new ProductsEntity();}
  }

  public ResponseEntity<Object> deleteProductsById(Integer id) {
    if (productsRepository.findById(id).isPresent()) {
      productsRepository.deleteById(id);
      return ResponseEntity.accepted().body("Product with id=" + id + " successfully deleted");
    } else {
      return ResponseEntity.badRequest().body("Product with id=" + id + " not found");
    }
  }
}
