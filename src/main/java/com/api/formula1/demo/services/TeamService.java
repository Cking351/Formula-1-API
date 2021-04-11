package com.api.formula1.demo.services;

import com.api.formula1.demo.models.Team;

import java.util.List;

public interface TeamService {
    Team save(Team team);

    List<Team> findAll();
    List<Team> findByName(String teamname);
}
