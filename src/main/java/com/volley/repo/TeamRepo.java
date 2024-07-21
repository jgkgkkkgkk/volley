package com.volley.repo;
import com.volley.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamRepo extends JpaRepository<Team,Integer> {

}
