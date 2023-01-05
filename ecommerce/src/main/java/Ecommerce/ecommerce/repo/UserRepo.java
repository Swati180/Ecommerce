package Ecommerce.ecommerce.repo;

import Ecommerce.ecommerce.Model.DTO.UserLoginDto;
import Ecommerce.ecommerce.Model.User;
import Ecommerce.ecommerce.Model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    public User findByUserEmailAndUserPassword(String UserEmail,String UserPassword);


}
