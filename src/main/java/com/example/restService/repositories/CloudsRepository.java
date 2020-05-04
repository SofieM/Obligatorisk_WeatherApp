package com.example.restService.repositories;

import com.example.restService.models.Clouds;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudsRepository extends CrudRepository<Clouds, Long> {
}
