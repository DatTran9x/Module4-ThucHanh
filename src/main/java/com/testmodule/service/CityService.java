package com.testmodule.service;

import com.testmodule.model.City;
import com.testmodule.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService{
    @Autowired
    CityRepo cityRepo;

    @Override
    public List<City> findAll() {
        return (List<City>) cityRepo.findAll();
    }

    @Override
    public void save(City city) {
        cityRepo.save(city);
    }

    @Override
    public void delete(int id) {
        cityRepo.deleteById(id);
    }

    @Override
    public City findById(int id) {
        return cityRepo.findById(id).get();
    }
}
