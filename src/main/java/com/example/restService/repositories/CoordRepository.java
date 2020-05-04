package com.example.restService.repositories;

import com.example.restService.models.Coord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordRepository extends CrudRepository<Coord, Long> {
}
