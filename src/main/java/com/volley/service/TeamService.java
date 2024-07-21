package com.volley.service;

import com.volley.entities.Team;
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

    public void createNewTeam(Team team) {
        teamRepo.save(team);
    }
}

