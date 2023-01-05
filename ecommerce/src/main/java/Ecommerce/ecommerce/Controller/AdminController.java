package Ecommerce.ecommerce.Controller;

import Ecommerce.ecommerce.Model.Admin;
import Ecommerce.ecommerce.Model.AdminLogin;
import Ecommerce.ecommerce.Model.DTO.AdminLoginDto;
import Ecommerce.ecommerce.exception.AdminException;
import Ecommerce.ecommerce.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/register")
    public ResponseEntity<String> registerAdmin(@RequestBody Admin admin) throws AdminException{
        return new ResponseEntity<String>(adminService.RegisterAdmin(admin), HttpStatus.CREATED);

    }

    @PostMapping("/Login")
    public  ResponseEntity<AdminLogin> loginAdmin(@RequestBody AdminLoginDto adminDto)throws AdminException{
        return new ResponseEntity<AdminLogin>(adminService.AdminLogin(adminDto), HttpStatus.OK);
    }

    @DeleteMapping("/Delete")
    public ResponseEntity<String> DeleteAdmin(@RequestParam("id") Integer id)throws AdminException{
        return new ResponseEntity<String>(adminService.DeleteAdmin(id),HttpStatus.OK);
    }

}
