package rest.spa_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rest.spa_api.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends MongoRepository<CategoryEntity,Integer> {
}
