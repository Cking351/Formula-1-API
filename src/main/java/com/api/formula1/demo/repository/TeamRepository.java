package com.api.formula1.demo.repository;

import com.api.formula1.demo.models.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
