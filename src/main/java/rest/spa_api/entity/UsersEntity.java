package rest.spa_api.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
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
  @NotNull
  private Integer id;
  @NotNull
  @Size(min = 3)
  private String adress;

  @NotNull
  @Size(min = 3)
  private String name;

  @NotNull
  @Size(min = 4)
  @Pattern(regexp = "[^0-9]*")
  private String city;

  @NotNull
  @Size(min = 5)
  @Pattern(regexp = "[^0-9]*")
  private String fio;

  @NotNull
  @Size(min = 4)
  private String role;

  @NotNull
  @Size(min = 6)
  private String password;

  @NotNull
  @Size(min = 10)
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
