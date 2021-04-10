package com.api.formula1.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long driverid;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = true)
    private String driverpicture;

    @ManyToOne
    @JoinColumn(name = "teamid", nullable = false)
    @JsonIgnoreProperties(value = "drivers", allowSetters = true)
    private Team team;

    public Driver(String firstname, String lastname, String driverpicture, Team team) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.driverpicture = driverpicture;
        this.team = team;
    }

    public Driver() {
    }

    public long getDriverid() {
        return driverid;
    }

    public void setDriverid(long driverid) {
        this.driverid = driverid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDriverpicture() {
        return driverpicture;
    }

    public void setDriverpicture(String driverpicture) {
        this.driverpicture = driverpicture;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
