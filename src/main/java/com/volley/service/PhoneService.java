package com.volley.service;

import com.volley.entities.Phone;
import com.volley.repo.PhoneRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PhoneService {

    private final PhoneRepo phoneRepo;
    public List<Phone> getAllPhone(){
        return phoneRepo.findAll();


    }
    public void createNewPhone(Phone phone){
        phoneRepo.save(phone);
    }
}
