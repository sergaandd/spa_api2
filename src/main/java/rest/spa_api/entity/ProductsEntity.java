package rest.spa_api.entity;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Setter
@EqualsAndHashCode


@Document(collection = "products")
public class ProductsEntity {

  @Id
  @Indexed
  private Integer id;
  private Integer category;

  private String details;
  private String name;
  private Float price;
  private String status;
  private String file_name;

  public Integer getId() {
    return id;
  }

  public Integer getCategory() {
    return category;
  }

  public String getDetails() {
    return details;
  }

  public String getName() {
    return name;
  }

  public Float getPrice() {
    return price;
  }

  public String getStatus() {
    return status;
  }

  public String getFile_name() {
    return file_name;
  }
}

