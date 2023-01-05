package Ecommerce.ecommerce.service.Impl;

import Ecommerce.ecommerce.Model.Admin;
import Ecommerce.ecommerce.Model.AdminLogin;
import Ecommerce.ecommerce.Model.DTO.AdminLoginDto;
import Ecommerce.ecommerce.exception.AdminException;
import Ecommerce.ecommerce.repo.AdminLoginRepo;
import Ecommerce.ecommerce.repo.AdminRepo;
import Ecommerce.ecommerce.service.AdminService;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AdminImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Autowired
    private AdminLoginRepo adminLoginRepo;

    @Override
    public String RegisterAdmin(Admin admin) throws AdminException {

        String response = "Not Registered";

        if(admin == null){
            throw new AdminException("Not registered");
        }
//        return  adminRepo.save(admin);
          adminRepo.save(admin);
        response = "register Successfully";
        return response;
         }

    @Override
    public AdminLogin AdminLogin(AdminLoginDto adminDto) throws AdminException {

        Admin admin = adminRepo.findByAdminEmailAndAdminPassword(adminDto.getEmail(),adminDto.getPassword());

        if(admin != null){

            Optional<AdminLogin> adminlog = adminLoginRepo.findById(admin.getAdminId());

            if(adminlog.isEmpty()){

                AdminLogin adlogin = new AdminLogin();

                adlogin.setAdminId(admin.getAdminId());

                String key = RandomString.make(10);
                adlogin.setKey(key);

                adlogin.setTimestamp(LocalDateTime.now());

                return adminLoginRepo.save(adlogin);
            }
            throw new AdminException("Admin already Logged in");
        }

        throw new AdminException("Please provide valid inputs");

    }

    @Override
    public AdminLogin AddProduct(AdminLoginDto adminDto) throws AdminException {



        return null;
    }

    @Override
    public String DeleteAdmin(Integer id) throws AdminException {

        Optional<Admin> admin = adminRepo.findById(id);

        if(admin != null){

           adminRepo.delete(admin.get());
            return admin.get().getAdminName()+" Deleted Successfully";
        }
        return "Admin not present";
    }
}
