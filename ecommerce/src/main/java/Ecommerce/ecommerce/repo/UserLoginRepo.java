package Ecommerce.ecommerce.repo;

import Ecommerce.ecommerce.Model.DTO.UserLoginDto;
import Ecommerce.ecommerce.Model.UserLogin;
import Ecommerce.ecommerce.exception.CustomerException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepo extends JpaRepository<UserLogin,Integer> {

    public UserLogin findByKey(String key) throws CustomerException;


}
