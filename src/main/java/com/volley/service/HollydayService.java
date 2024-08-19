package com.volley.service;

import com.volley.entities.Hollyday;
import com.volley.exceptions.NotFoundException;
import com.volley.repo.HollydayRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HollydayService {

    private HollydayRepo hollydayRepo;

    public List<Hollyday> getAllHollyday() {
        return hollydayRepo.findAll();
    }

    public Hollyday getHollydayById(Integer id) {
        return hollydayRepo.findById(id).orElseThrow(NotFoundException::new);
    }

    public void createNewHollyday(Hollyday hollyday) {
        hollydayRepo.save(hollyday);
    }


    public void deleteHollydayById(Integer id) {
        getHollydayById(id);
        hollydayRepo.deleteById(id);
    }
    public Hollyday updateHollydayById(Integer id, Hollyday hollyday) {
        getHollydayById(id);
        return hollydayRepo.save(hollyday);
    }
}

