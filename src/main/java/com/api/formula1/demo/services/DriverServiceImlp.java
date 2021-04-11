package com.api.formula1.demo.services;

import com.api.formula1.demo.models.Driver;
import com.api.formula1.demo.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "driverService")
public class DriverServiceImlp implements DriverService {
    @Autowired
    DriverService driverService;

    @Autowired
    DriverRepository driverRepository;

    @Override
    public List<Driver> findAll() {
        List<Driver> list = new ArrayList<>();
        driverRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public List<Driver> getDriver(String drivername) {
        List<Driver> list = new ArrayList<>();
        driverRepository.findAll().forEach(name -> {
            if (name.getLastname().toLowerCase().contains(drivername.toLowerCase()) || name.getFirstname().toLowerCase().contains(drivername.toLowerCase())) {
                list.add(name);
            }
        });
        return list;
    }
}
