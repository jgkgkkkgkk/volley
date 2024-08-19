package com.volley.controller;
import com.volley.entities.Hollyday;
import com.volley.service.HollydayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hollyday")
public class HollydayController {

    @Autowired
    private HollydayService hollydayService;

    @PostMapping("/save")
    public void insertHollyday(@RequestBody Hollyday hollyday) {
        hollydayService.createNewHollyday(hollyday);
    }

    @GetMapping("/list")
    public List<Hollyday> findAllHollyday() {
        return hollydayService.getAllHollyday();
    }

    @DeleteMapping("/{id}")
    public void deleteHollydayById(@PathVariable Integer id) {
        hollydayService.deleteHollydayById(id);
    }
    @PutMapping("/{id}")
    public Hollyday updateHollydayById(@PathVariable Integer id, @RequestBody Hollyday hollyday) {
        return hollydayService.updateHollydayById(id, hollyday);
    }
}
