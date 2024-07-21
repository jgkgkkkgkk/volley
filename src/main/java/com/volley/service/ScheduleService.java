package com.volley.service;

import com.volley.entities.Schedule;
import com.volley.repo.ScheduleRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScheduleService {

private final ScheduleRepo scheduleRepo;
public List<Schedule> getAllSchedule(){
    return scheduleRepo.findAll();


}
public void createNewSchedule(Schedule schedule){
    scheduleRepo.save(schedule);
}
}
