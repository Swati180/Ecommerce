package Ecommerce.ecommerce.Model.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserLoginDto {

        private String email;
        private String password;


}
