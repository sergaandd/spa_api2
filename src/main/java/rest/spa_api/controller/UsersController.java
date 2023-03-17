package rest.spa_api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.spa_api.entity.UsersEntity;
import rest.spa_api.repository.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersController {

  @Autowired
  private final UsersRepository usersRepository;

  public UsersController(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @GetMapping("/")
  public List<UsersEntity> getAllUsers() {
    return usersRepository.findAll();
  }
}
