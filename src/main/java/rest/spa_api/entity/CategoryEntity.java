package rest.spa_api.entity;

import javax.validation.constraints.Pattern;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Setter
@EqualsAndHashCode

@Document(collection = "category")
public class CategoryEntity {

  @Id
  @Indexed
  private Integer id;
  @Pattern(regexp = "[^0-9]*")
  private String name;

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}

