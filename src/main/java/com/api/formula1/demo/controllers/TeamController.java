package com.api.formula1.demo.controllers;

import com.api.formula1.demo.models.Team;
import com.api.formula1.demo.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping(value = "/teams", produces = "application/json")
    public ResponseEntity<?> getAllTeams() {
        List<Team> myTeams = teamService.findAll();
        return new ResponseEntity<>(myTeams, HttpStatus.OK);
    }
}
