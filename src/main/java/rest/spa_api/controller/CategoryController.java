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
import rest.spa_api.entity.CategoryEntity;
import rest.spa_api.entity.UsersEntity;
import rest.spa_api.service.CategoryService;

  @RestController
  @RequestMapping("/category")
  public class CategoryController {

  @Autowired
  private final CategoryService categoryService;

  public CategoryController(CategoryService categoryService) {
    this.categoryService = categoryService;
  }


  @GetMapping("/")
    public List<CategoryEntity> getAllCategory() {
      return categoryService.getAllCategory();
    }

    @GetMapping("/{id}")
    public Optional<CategoryEntity> getCategoryById
        (@PathVariable(value = "id") Integer id) {
      return categoryService.getCategoryById(id);
    }

    @PostMapping("/")
    public CategoryEntity createCategory(@Valid @RequestBody CategoryEntity category) {
      return categoryService.createCategory(category);
    }

    @PutMapping("/")
    public CategoryEntity updateCategory(@Valid @RequestBody CategoryEntity category) {
      return categoryService.updateCategory(category);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCategoryById(@PathVariable Integer id) {
      return categoryService.deleteCategoryById(id);
    }
  }


