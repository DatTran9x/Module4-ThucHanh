package com.testmodule.service;

import com.testmodule.model.City;

import java.util.List;

public interface ICityService {
    List<City> findAll();
    void save(City city);
    void delete(int id);
    City findById(int id);
}
