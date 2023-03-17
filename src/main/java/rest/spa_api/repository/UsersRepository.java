package rest.spa_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rest.spa_api.entity.UsersEntity;

@Repository
public interface UsersRepository extends MongoRepository<UsersEntity,Integer> {
}