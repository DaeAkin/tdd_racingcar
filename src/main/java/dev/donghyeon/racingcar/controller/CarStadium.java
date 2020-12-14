package dev.donghyeon.racingcar.controller;

import dev.donghyeon.racingcar.domain.Car;

import java.util.List;
import java.util.Random;

public class CarStadium {

    private final List<Car> cars;
    private final int count;

    public CarStadium(List<Car> cars,int count) {
        this.cars = cars;
        this.count = count;
    }

    public void letsRace() {
        for(int i=0; i<count; i++) {
            cars.forEach(car -> car.move(generateRandom()));
        }
    }

    private int generateRandom() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
