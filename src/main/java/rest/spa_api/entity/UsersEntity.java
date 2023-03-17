package rest.spa_api.entity;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@Setter
@EqualsAndHashCode

@Document(collection = "users")

public class UsersEntity {

  @Id
  private Integer id;

  private String adress;


  private String name;


  private String city;


  private String fio;


  private String role;


  private String password;


  private String phone;

  public Integer getId() {
    return id;
  }

  public String getAdress() {
    return adress;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  public String getFio() {
    return fio;
  }

  public String getRole() {
    return role;
  }

  public String getPassword() {
    return password;
  }

  public String getPhone() {
    return phone;
  }

}
