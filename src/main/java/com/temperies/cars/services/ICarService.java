package com.temperies.cars.services;

import com.temperies.cars.model.Car;

import java.util.List;
import java.util.Optional;

public interface ICarService {
    List<Car> findAll();
    Optional<Car> findById(Long id);
    Long create(Car car);
    boolean update(Long id, Car car);
    boolean deleteById(Long id);
}
