package com.api.formula1.demo.services;

import com.api.formula1.demo.exceptions.ResourceNotFoundException;
import com.api.formula1.demo.models.Team;
import com.api.formula1.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Transactional
@Service(value = "teamService")
public class TeamServiceImlp implements TeamService{
    @Autowired
    private TeamRepository teamrepos;

    @Autowired
    private DriverService driverService;


    @Transactional
    @Override
    public Team save(Team team) {
        Team newTeam = new Team();

        if (team.getTeamid() != 0) {
            teamrepos.findById(team.getTeamid()).orElseThrow(() -> new ResourceNotFoundException("Team id " + team.getTeamid() + " not found!"));
            newTeam.setTeamid(team.getTeamid());
        }
        newTeam.setTeamname(team.getTeamname());
        newTeam.setDrivers(team.getDrivers());
        newTeam.setFirstentry(team.getFirstentry());
        newTeam.setTeamprincipalname(team.getTeamprincipalname());
        newTeam.setOwnername(team.getOwnername());
        return teamrepos.save(newTeam);
    }

    @Override
    public List<Team> findAll() {
        List<Team> list = new ArrayList<>();
        // iterate over the iterator set and add each element to the array list.
        teamrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
