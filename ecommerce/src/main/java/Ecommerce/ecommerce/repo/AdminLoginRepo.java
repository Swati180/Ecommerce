package Ecommerce.ecommerce.repo;

import Ecommerce.ecommerce.Model.AdminLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminLoginRepo extends JpaRepository<AdminLogin,Integer> {

    public AdminLogin findByKey(String key);

}
