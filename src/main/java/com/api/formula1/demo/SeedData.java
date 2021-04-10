package com.api.formula1.demo;

import com.api.formula1.demo.models.Driver;
import com.api.formula1.demo.models.Team;
import com.api.formula1.demo.services.DriverService;
import com.api.formula1.demo.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
@Component
public class SeedData implements CommandLineRunner {
    @Autowired
    DriverService driverService;

    @Autowired
    TeamService teamService;

    @Transactional
    @Override
    public void run(String[] args) throws Exception {
        //TODO delete all before creating. Just to be safe.

        Team t1 = new Team("Mercedes", 1970, "Mercedes", "Toto Wolff");
        Team t2 = new Team("Red Bull Racing", 1997, "Red Bull GmbH", "Christian Horner");
        Team t3 = new Team("McLaren", 1966, "McLaren Group", "Andreas Seidl");
        Team t4 = new Team("Scuderia Ferrari", 1950, "Ferrari S.p.A", "Mattia Binotto");
        Team t5 = new Team("Scuderia AlphaTauri", 1985, "Red Bull GmbH", "Franz Tost");
        Team t6 = new Team("Aston Martin", 2018, "Lawrence Stroll", "Otmar Szafnauer");
        Team t7 = new Team("Alfa Romeo Racing", 1993, "Sauber Motorsport AG", "Frederic Vasseur");
        Team t8 = new Team("Alpine F1 Team", 1986, "Group Renault", "Laurent Rossi");
        Team t9 = new Team("Williams Racing", 1978, "Dorilton Capital", "Simon Roberts");
        Team t10 = new Team("Haas F1 Team", 2016, "Gene Haas", "Guenther Steiner");
        t1 = teamService.save(t1);
        t2 = teamService.save(t2);
        t3 = teamService.save(t3);
        t4 = teamService.save(t4);
        t5 = teamService.save(t5);
        t6 = teamService.save(t6);
        t7 = teamService.save(t7);
        t8 = teamService.save(t8);
        t9 = teamService.save(t9);
        t10 = teamService.save(t10);

        // Mercedes
        Driver d1 = new Driver("Lewis", "Hamilton", "https://www.formula1.com/content/dam/fom-website/drivers/L/LEWHAM01_Lewis_Hamilton/lewham01.png.transform/2col/image.png", t1);
        t1.getDrivers().add(d1);
        Driver d2 = new Driver("Valtteri", "Bottas", "https://www.formula1.com/content/dam/fom-website/drivers/V/VALBOT01_Valtteri_Bottas/valbot01.png.transform/2col/image.png", t1);
        t1.getDrivers().add(d2);

        // Red Bull Racing
        Driver d3 = new Driver("Max", "Verstappen", "https://www.formula1.com/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png.transform/2col/image.png", t2);
        t2.getDrivers().add(d3);
        Driver d4 = new Driver("Sergio", "Perez", "https://www.formula1.com/content/dam/fom-website/drivers/S/SERPER01_Sergio_Perez/serper01.png.transform/2col/image.png", t2);
        t2.getDrivers().add(d4);





    }
}
