package rest.spa_api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import rest.spa_api.entity.CategoryEntity;
import rest.spa_api.repository.CategoryRepository;
@Service
public class CategoryService {

  private final CategoryRepository categoryRepository;

  public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  public List<CategoryEntity> getAllCategory() {
    return categoryRepository.findAll();
  }

  public Optional<CategoryEntity> getCategoryById(Integer id) {
    return categoryRepository.findById(id);
  }

  public CategoryEntity createCategory(CategoryEntity category) {
    if(categoryRepository.findById(category.getId()).isPresent()) {
      return new CategoryEntity();
    } else { return categoryRepository.save(category); }
  }

  public CategoryEntity updateCategory(CategoryEntity category) {
    if(categoryRepository.findById(category.getId()).isPresent()) {
      return categoryRepository.save(category);
    } else { return new CategoryEntity();}
  }

  public ResponseEntity<Object> deleteCategoryById(Integer id) {
    if (categoryRepository.findById(id).isPresent()) {
      categoryRepository.deleteById(id);
      return ResponseEntity.accepted().body("Category with id=" + id + " successfully deleted");
    } else {
      return ResponseEntity.badRequest().body("Category with id=" + id + " not found");
    }
  }
}
