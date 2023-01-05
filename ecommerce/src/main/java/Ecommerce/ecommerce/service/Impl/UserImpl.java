package Ecommerce.ecommerce.service.Impl;

import Ecommerce.ecommerce.Model.AdminLogin;
import Ecommerce.ecommerce.Model.DTO.AdminLoginDto;
import Ecommerce.ecommerce.Model.DTO.UserLoginDto;
import Ecommerce.ecommerce.Model.User;
import Ecommerce.ecommerce.Model.UserLogin;
import Ecommerce.ecommerce.exception.CustomerException;
import Ecommerce.ecommerce.repo.UserLoginRepo;
import Ecommerce.ecommerce.repo.UserRepo;
import Ecommerce.ecommerce.service.UserService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

public class UserImpl implements UserService {

    @Autowired
    UserLoginRepo userLoginRepo;

    @Autowired
    UserRepo userRepo;

    @Override
    public String AddCustomer(User user) throws CustomerException {

       if(user != null){
            userRepo.save(user);
            return "Registered Successfully";
       }
         throw new CustomerException("Not Registered");
    }

    @Override
    public UserLogin LoginCustomer(UserLoginDto LoginDto) throws CustomerException {

       User user = userRepo.findByUserEmailAndUserPassword(LoginDto.getEmail(),LoginDto.getPassword());

       if(user != null){
           Optional<UserLogin> users = userLoginRepo.findById(user.getCustomerId());
           if(users.isEmpty()){
               UserLogin userLogin1 = new UserLogin();
               userLogin1.setUserId(user.getCustomerId());

               String key = RandomString.make(10);
               userLogin1.setKey(key);

               userLogin1.setLocalDate(LocalDate.now());

               return userLoginRepo.save(userLogin1);
           }else{
               throw new CustomerException("Already Logged In");
           }


       }

        throw new CustomerException("Either Your Password OR Email is Incorrect");
    }

    @Override
    public String LogoutCustomer(String key) throws CustomerException {

        UserLogin userLogin = userLoginRepo.findByKey(key);
        if(userLogin != null){
            userLoginRepo.delete(userLogin);
            return "Logged Out";
        }

        throw new CustomerException("Please Pass The Valid Key");
    }
}
