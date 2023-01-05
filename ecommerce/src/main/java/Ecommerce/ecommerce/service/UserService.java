package Ecommerce.ecommerce.service;

import Ecommerce.ecommerce.Model.AdminLogin;
import Ecommerce.ecommerce.Model.DTO.AdminLoginDto;
import Ecommerce.ecommerce.Model.DTO.UserLoginDto;
import Ecommerce.ecommerce.Model.User;
import Ecommerce.ecommerce.Model.UserLogin;
import Ecommerce.ecommerce.exception.CustomerException;

public interface UserService {

    public String AddCustomer(User user)throws CustomerException;
    public UserLogin LoginCustomer(UserLoginDto LoginDto)throws CustomerException;
    public String LogoutCustomer(String key)throws CustomerException;

}
