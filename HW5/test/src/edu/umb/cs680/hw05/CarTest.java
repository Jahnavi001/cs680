package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carArray = {car.getMake(), car.getModel(), Integer.toString(car.getYear())};
		return carArray;
	}
	
	@Test
	void verifyCarEqualityWithMakeModelYear() {
		String[] expected = {"Audi", "Q8", "2019"};
		Car actual = new Car("Audi", "Q8", 2019, 1000, 25000);
		assertArrayEquals(expected, carToStringArray(actual) );
	}
	
}
		
