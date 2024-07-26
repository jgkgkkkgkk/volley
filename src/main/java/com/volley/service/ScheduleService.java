package com.volley.service;

import com.volley.entities.Schedule;
import com.volley.exceptions.NotFoundException;
import com.volley.repo.ScheduleRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScheduleService {

    private final ScheduleRepo scheduleRepo;

    public List<Schedule> getAllSchedule() {
        return scheduleRepo.findAll();

    }

    public Schedule getScheduleById(Integer id) {
        return scheduleRepo.findById(id).orElseThrow(NotFoundException::new);
    }

    public void createNewSchedule(Schedule schedule) {
        scheduleRepo.save(schedule);
    }

    public void deleteScheduleById(Integer id) {
        getScheduleById(id);
        scheduleRepo.deleteById(id);
    }

    public Schedule updateScheduleById(Integer id, Schedule schedule) {
        getScheduleById(id);
        return scheduleRepo.save(schedule);
    }
}
