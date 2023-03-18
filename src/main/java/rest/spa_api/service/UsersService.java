package rest.spa_api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import rest.spa_api.entity.UsersEntity;
import rest.spa_api.repository.UsersRepository;

@Service
public class UsersService {

  private final UsersRepository usersRepository;

  public UsersService(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  public List<UsersEntity> getAll() {
    return usersRepository.findAll();
  }

  public Optional<UsersEntity> getUserById(Integer id) {return usersRepository.findById(id);}

  public UsersEntity createUser(UsersEntity user) {
    if (usersRepository.findById(user.getId()).isPresent()) {
      return new UsersEntity();
    } else {
      return usersRepository.save(user);
    }
  }

  public UsersEntity updateUser(UsersEntity user) {
    if (usersRepository.findById(user.getId()).isPresent()) {
        return usersRepository.save(user);
    } else { return new UsersEntity();}
  }


  public ResponseEntity<Object> deleteById(Integer id) {
    if (usersRepository.findById(id).isPresent()) {
      usersRepository.deleteById(id);
      return ResponseEntity.accepted().body("User with id=" + id + " successfully deleted");
    } else {
      return ResponseEntity.badRequest().body("User with id=" + id + " not found");
    }
  }
}
