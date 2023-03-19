package rest.spa_api.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.spa_api.entity.UsersEntity;
import rest.spa_api.service.UsersService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="http://localhost:4200")
public class UsersController {

  @Autowired
  private final UsersService usersService;

  public UsersController(UsersService usersService) {
    this.usersService = usersService;
  }

  @GetMapping("/")
  public List<UsersEntity> getAllUsers() {
    return usersService.getAll();
  }

  @GetMapping("/{id}")
  public Optional<UsersEntity> getUserById
      (@PathVariable(value = "id") Integer id) {
    return usersService.getUserById(id);
  }

  @PostMapping("/")
  public UsersEntity createUser(@Valid @RequestBody UsersEntity user) {
    return usersService.createUser(user);
  }
  @PutMapping("/")
  public UsersEntity updateUser(@Valid @RequestBody UsersEntity user) {
    return usersService.updateUser(user);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Object> deleteById(@PathVariable Integer id) {
    return usersService.deleteById(id);
  }
}
