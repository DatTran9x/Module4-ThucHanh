package com.testmodule.controller;

import com.testmodule.model.City;
import com.testmodule.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/home")
public class CityController {
    @Autowired
    ICityService cityService;

    @GetMapping
    public ResponseEntity<List<City>> findAll(){
        return new ResponseEntity(cityService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> findById(@PathVariable int id){
        return new ResponseEntity(cityService.findById(id),HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity save(@RequestBody City city){
        cityService.save(city);
        return new ResponseEntity(city,HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<City> update(@RequestBody City city){
        cityService.save(city);
        return new ResponseEntity(city,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        cityService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
