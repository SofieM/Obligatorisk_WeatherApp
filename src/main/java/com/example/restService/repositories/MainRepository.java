package com.example.restService.repositories;

import com.example.restService.models.Main;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends CrudRepository<Main, Long> {
}
