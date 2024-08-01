package com.volley.controller;
import com.volley.entities.Schedule;
import com.volley.entities.Team;
import com.volley.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/save")
    public void insertTeam(@RequestBody Team team) {
        teamService.createNewTeam(team);
    }

    @GetMapping("/list")
    public List<Team> findAllTeams() {
        return teamService.getAllTeams();
    }

    @DeleteMapping("/{id}")
    public void deleteTeamById(@PathVariable Integer id) {
        teamService.deleteTeamById(id);
    }
    @PutMapping("/{id}")
    public Team updateTeamById(@PathVariable Integer id, @RequestBody Team team) {
        return teamService.updateTeamById(id, team);
    }
}
