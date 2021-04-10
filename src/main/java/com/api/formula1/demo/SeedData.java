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

        // McLaren
        Driver d5 = new Driver("Daniel", "Ricciardo", "https://www.formula1.com/content/dam/fom-website/drivers/D/DANRIC01_Daniel_Ricciardo/danric01.png.transform/2col/image.png", t3);
        t3.getDrivers().add(d5);
        Driver d6 = new Driver("Lando", "Norris", "https://www.formula1.com/content/dam/fom-website/drivers/L/LANNOR01_Lando_Norris/lannor01.png.transform/2col/image.png", t3);
        t3.getDrivers().add(d6);

        // Ferrari
        Driver d7 = new Driver("Charles", "Leclerc", "https://www.formula1.com/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png.transform/2col/image.png", t4);
        t4.getDrivers().add(d7);
        Driver d8 = new Driver("Carloz", "Sainz", "https://www.formula1.com/content/dam/fom-website/drivers/C/CARSAI01_Carlos_Sainz/carsai01.png.transform/2col/image.png", t4);
        t4.getDrivers().add(d8);

        // Alpha Tauri
        Driver d9 = new Driver("Yuki", "Tsunoda", "https://www.formula1.com/content/dam/fom-website/drivers/Y/YUKTSU01_Yuki_Tsunoda/yuktsu01.png.transform/2col/image.png", t5);
        t5.getDrivers().add(d9);
        Driver d10 = new Driver("Pierre", "Gasly", "https://www.formula1.com/content/dam/fom-website/drivers/P/PIEGAS01_Pierre_Gasly/piegas01.png.transform/2col/image.png", t5);
        t5.getDrivers().add(d10);

        // Aston Martin
        Driver d11 = new Driver("Sebastion", "Vettel", "https://www.formula1.com/content/dam/fom-website/drivers/S/SEBVET01_Sebastian_Vettel/sebvet01.png.transform/2col/image.png", t6);
        t6.getDrivers().add(d11);
        Driver d12 = new Driver("Lance", "Stroll", "https://www.formula1.com/content/dam/fom-website/drivers/L/LANSTR01_Lance_Stroll/lanstr01.png.transform/2col/image.png", t6);
        t6.getDrivers().add(d12);

        // Alfa Romeo
        Driver d13 = new Driver("Antonio", "Giovinazzi", "https://www.formula1.com/content/dam/fom-website/drivers/A/ANTGIO01_Antonio_Giovinazzi/antgio01.png.transform/2col/image.png", t7);
        t7.getDrivers().add(d13);
        Driver d14 = new Driver("Kimi", "Räikkönen", "https://www.formula1.com/content/dam/fom-website/drivers/K/KIMRAI01_Kimi_R%C3%A4ikk%C3%B6nen/kimrai01.png.transform/2col/image.png", t7);
        t7.getDrivers().add(d14);

        // Alpine
        Driver d15 = new Driver("Fernando", "Alonso", "https://www.formula1.com/content/dam/fom-website/drivers/F/FERALO01_Fernando_Alonso/feralo01.png.transform/2col/image.png", t8);
        t8.getDrivers().add(d15);
        Driver d16 = new Driver("Esteban", "Ocon", "https://www.formula1.com/content/dam/fom-website/drivers/E/ESTOCO01_Esteban_Ocon/estoco01.png.transform/2col/image.png", t8);
        t8.getDrivers().add(d16);

        // Williams
        Driver d17 = new Driver("George", "Russell", "https://www.formula1.com/content/dam/fom-website/drivers/G/GEORUS01_George_Russell/georus01.png.transform/2col/image.png", t9);
        t9.getDrivers().add(d17);
        Driver d18 = new Driver("Nicholas", "Latifi", "https://www.formula1.com/content/dam/fom-website/drivers/N/NICLAF01_Nicholas_Latifi/niclaf01.png.transform/2col/image.png", t9);
        t9.getDrivers().add(d18);

        // Haas
        Driver d19 = new Driver("Mick", "Schumacher", "https://www.formula1.com/content/dam/fom-website/drivers/M/MICSCH02_Mick_Schumacher/micsch02.png.transform/2col/image.png", t10);
        t10.getDrivers().add(d19);
        Driver d20 = new Driver("Nikita", "Mazepin", "https://www.formula1.com/content/dam/fom-website/drivers/N/NIKMAZ01_Nikita_Mazepin/nikmaz01.png.transform/2col/image.png", t10);
        t10.getDrivers().add(d20);



    }
}
