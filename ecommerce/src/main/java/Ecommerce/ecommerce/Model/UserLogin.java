package Ecommerce.ecommerce.Model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserLogin {

    @Id
    private Integer UserId;
    @Column(unique = true)
    private String key;
    private LocalDate localDate;

}
