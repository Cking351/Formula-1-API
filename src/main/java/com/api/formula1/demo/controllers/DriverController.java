package com.api.formula1.demo.controllers;

import com.api.formula1.demo.models.Driver;
import com.api.formula1.demo.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/driver")
public class DriverController {
    @Autowired
    DriverService driverService;

    @GetMapping(value = "/drivers", produces = "application/json")
    public ResponseEntity<?> getAllDrivers() {
        List<Driver> allDrivers = driverService.findAll();
        return new ResponseEntity<>(allDrivers, HttpStatus.OK);
    }

    @GetMapping(value = "/{drivername}", produces="application/json")
    public ResponseEntity<?> getDriverByName(@PathVariable String drivername) {
        List<Driver> driverList = driverService.getDriver(drivername);
        return new ResponseEntity<>(driverList, HttpStatus.OK);
    }
}
