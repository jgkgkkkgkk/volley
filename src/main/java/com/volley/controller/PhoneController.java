package com.volley.controller;
import com.volley.entities.Phone;
import com.volley.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @PostMapping("/save")
    public void insertMovie(@RequestBody Phone phone) {
        phoneService.createNewPhone(phone);
    }

    @GetMapping("/list")
    public List<Phone> findAllPhones() {
        return phoneService.getAllPhone();
    }

}
