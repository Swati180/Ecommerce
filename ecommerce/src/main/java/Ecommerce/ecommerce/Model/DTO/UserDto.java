package Ecommerce.ecommerce.Model.DTO;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDto {


    //    @Pattern(regexp = "^[a-zA-Z]*$")
    private String firstname;
    //    @Pattern(regexp = "^[a-zA-Z]*$")
    private String lastName;
    @Column(unique = true)
    @Email(message = "Please provide valid email")
    private String email;
    //    @Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})",message="atLeast contain 1 Numeric,1 special character or one lowercase, One upper character and size must be 6 to 12")
    private String password;
    @Column(unique = true)
//    @Size(min = 10,max = 12,message = "please Enter valid Mobile Number")
    private String mobile;

}
