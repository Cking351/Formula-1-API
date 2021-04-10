package com.api.formula1.demo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long teamid;

    @Column(nullable = false)
    private String teamname;

    @Column(nullable = true)
    private long firstentry;

    @Column(nullable = true)
    private String ownername;

    @Column(nullable = false)
    private String teamprincipalname;

    @OneToMany(mappedBy = "team",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<Driver> drivers = new ArrayList<>();


    public Team(String teamname, long firstentry, String ownername, String teamprincipalname) {
        this.teamname = teamname;
        this.firstentry = firstentry;
        this.ownername = ownername;
        this.teamprincipalname = teamprincipalname;
    }

    public Team() {
    }


    public long getTeamid() {
        return teamid;
    }

    public void setTeamid(long teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public long getFirstentry() {
        return firstentry;
    }

    public void setFirstentry(long firstrace) {
        this.firstentry = firstrace;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getTeamprincipalname() {
        return teamprincipalname;
    }

    public void setTeamprincipalname(String teamprincipalname) {
        this.teamprincipalname = teamprincipalname;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
}
