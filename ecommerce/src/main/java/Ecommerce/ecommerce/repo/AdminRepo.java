package Ecommerce.ecommerce.repo;

import Ecommerce.ecommerce.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer> {

    public Admin findByAdminEmailAndAdminPassword(String adminEmail, String adminPassword);

}
