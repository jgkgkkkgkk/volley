package com.volley.service;

import com.volley.entities.Schedule;
import com.volley.entities.Team;
import com.volley.exceptions.NotFoundException;
import com.volley.repo.TeamRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {

    private final TeamRepo teamRepo;

    public List<Team> getAllTeams() {
        return teamRepo.findAll();
    }

    public Team getTeamById(Integer id) {
        return teamRepo.findById(id).orElseThrow(NotFoundException::new);
    }

    public void createNewTeam(Team team) {
        teamRepo.save(team);
    }


    public void deleteTeamById(Integer id) {
        getTeamById(id);
        teamRepo.deleteById(id);
    }
    public Team updateTeamById(Integer id, Team team) {
        getTeamById(id);
        return teamRepo.save(team);
    }
}

