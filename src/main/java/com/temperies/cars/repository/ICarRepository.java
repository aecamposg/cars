package com.temperies.cars.repository;

import com.temperies.cars.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Transactional
@Repository
public interface ICarRepository extends Serializable, JpaRepository<Car,Long> {
}
