package Ecommerce.ecommerce.service;

import Ecommerce.ecommerce.Model.Admin;
import Ecommerce.ecommerce.Model.AdminLogin;
import Ecommerce.ecommerce.Model.DTO.AdminLoginDto;
import Ecommerce.ecommerce.exception.AdminException;

public interface AdminService {

    public String RegisterAdmin(Admin admin) throws AdminException;
    public AdminLogin AdminLogin(AdminLoginDto adminDto) throws AdminException;
    public AdminLogin AddProduct(AdminLoginDto adminDto) throws AdminException;
    public String DeleteAdmin(Integer id) throws AdminException;


}
