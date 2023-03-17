package rest.spa_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rest.spa_api.entity.ProductsEntity;

@Repository
public interface ProductsRepository extends MongoRepository<ProductsEntity,Integer> {
}