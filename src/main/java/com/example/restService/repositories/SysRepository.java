package com.example.restService.repositories;

import com.example.restService.models.Sys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRepository extends CrudRepository<Sys, Long> {
}
