package rest.spa_api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.spa_api.entity.CategoryEntity;
import rest.spa_api.repository.CategoryRepository;

  @RestController
  @RequestMapping("/category")
  public class CategoryController {

    @Autowired
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
      this.categoryRepository = categoryRepository;
    }

    @GetMapping("/")
    public List<CategoryEntity> getAllcategory() {
      return categoryRepository.findAll();
    }
  }


