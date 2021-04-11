package com.api.formula1.demo.repository;

import com.api.formula1.demo.models.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface DriverRepository extends CrudRepository<Driver, Long>, QueryByExampleExecutor<Driver> {
}
