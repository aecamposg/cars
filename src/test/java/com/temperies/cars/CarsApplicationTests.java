package com.temperies.cars;

import com.temperies.cars.model.Car;
import com.temperies.cars.services.ICarService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CarsApplicationTests {
	@Autowired
	private ICarService iCarService;

	@Test
	public void givenCar_whenCreate_thenReturnIdOfCar() {
		Car car = new Car();
		car.setBrand("Brand");
		car.setModel("Model");

		assertThat(iCarService.create(car).longValue());
	}

}
