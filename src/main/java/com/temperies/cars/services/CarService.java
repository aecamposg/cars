package com.temperies.cars.services;

import com.temperies.cars.model.Car;
import com.temperies.cars.repository.ICarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CarService implements ICarService {
    private final ICarRepository iCarRepository;

    public List<Car> findAll() {
        return iCarRepository.findAll();
    }

    public Optional<Car> findById(Long id) {
        return iCarRepository.findById(id);
    }

    public Long create(Car car) {
        car.setCreated(new Date());
        iCarRepository.saveAndFlush(car);
        return car.getId();
    }

    public boolean update(Long id, Car car) {
        boolean response = false;
        Optional<Car> findCar = iCarRepository.findById(id);
        
        if(findCar.isPresent()) {
            iCarRepository.findById(id)
                    .map(c -> {
                        c.setBrand(car.getBrand());
                        c.setModel(car.getModel());
                        c.setMaxKms(car.getMaxKms());
                        c.setCv(car.getCv());
                        c.setMinTime(car.getMinTime());
                        c.setCc(car.getCc());
                        c.setCylinders(car.getCylinders());
                        c.setKg(car.getKg());
                        c.setImage(car.getImage());
                        return iCarRepository.saveAndFlush(c);
                    });
            response = true;
        }
        return response;
    }

    public boolean deleteById(Long id) {
        boolean response = false;
        Optional<Car> findCar = iCarRepository.findById(id);

        if(findCar.isPresent()) {
            iCarRepository.deleteById(id);
            response = true;
        }
        return response;
    }
}
