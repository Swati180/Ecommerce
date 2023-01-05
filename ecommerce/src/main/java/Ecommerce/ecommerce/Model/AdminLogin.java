package Ecommerce.ecommerce.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class AdminLogin {

    @Id
    private Integer adminId;
    private String key;
    private LocalDateTime timestamp;
}
