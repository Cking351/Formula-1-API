package com.api.formula1.demo.services;

import com.api.formula1.demo.models.Driver;

import java.util.List;

public interface DriverService {
    List<Driver> findAll();

    List<Driver> getDriver(String drivername);
}
