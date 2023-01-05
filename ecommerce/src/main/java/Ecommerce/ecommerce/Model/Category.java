package Ecommerce.ecommerce.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryId;
    @Column(unique = true)
    private String categoryName;
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "category")
    @JsonIgnore
//	@JsonManagedReference
    private Set<Products> products=new HashSet<>();
}
