package com.example.restService.repositories;

import com.example.restService.models.Wind;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindRepository extends CrudRepository<Wind, Long> {
}
