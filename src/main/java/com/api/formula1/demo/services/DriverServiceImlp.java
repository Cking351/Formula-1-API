package com.api.formula1.demo.services;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "driverService")
public class DriverServiceImlp implements DriverService {
}
