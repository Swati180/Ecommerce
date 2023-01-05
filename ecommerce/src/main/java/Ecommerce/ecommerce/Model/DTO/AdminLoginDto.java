package Ecommerce.ecommerce.Model.DTO;

import lombok.*;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class AdminLoginDto {

    private String Email;
    private String password;
}
