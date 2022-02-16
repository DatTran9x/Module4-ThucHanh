package com.testmodule.repository;

import com.testmodule.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends CrudRepository<City,Integer> {
}
