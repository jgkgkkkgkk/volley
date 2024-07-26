package com.volley.controller;

import com.volley.entities.Schedule;
import com.volley.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping("/save")
    public void insertSchedule(@RequestBody Schedule schedule) {
        scheduleService.createNewSchedule(schedule);
    }

    @GetMapping("/list")
    public List<Schedule> findAllSchedules() {
        return scheduleService.getAllSchedule();
    }

    @GetMapping("/{id}")
    public Schedule findScheduleById(@PathVariable Integer id) {
        return scheduleService.getScheduleById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteScheduleById(@PathVariable Integer id) {
        scheduleService.deleteScheduleById(id);
    }

    @PutMapping("/{id}")
    public Schedule updateScheduleById(@PathVariable Integer id, @RequestBody Schedule schedule) {
        return scheduleService.updateScheduleById(id, schedule);
    }

}
