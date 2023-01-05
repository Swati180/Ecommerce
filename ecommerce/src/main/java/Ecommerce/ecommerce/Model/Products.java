package Ecommerce.ecommerce.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;
    private Integer quantity;
    private String desc;
    private String image;
    private LocalDateTime LastDateTime;
    private Integer id;
    private String ProductName;
    private String rating;
    private Integer ProductPrice;
    private String status;

    @ManyToOne(cascade =CascadeType.ALL)
    private Category category;

}
