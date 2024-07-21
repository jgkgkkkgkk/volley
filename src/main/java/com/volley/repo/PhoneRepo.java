package com.volley.repo;
import com.volley.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepo extends JpaRepository<Phone,Integer> {

}
