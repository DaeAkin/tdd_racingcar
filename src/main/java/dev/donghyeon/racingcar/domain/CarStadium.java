package dev.donghyeon.racingcar.domain;

import dev.donghyeon.racingcar.view.Result;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarStadium {

    private final List<Car> cars;
    private final int count;
    private final MoveStrategy moveStrategy;

    public CarStadium(List<Car> cars, int count, MoveStrategy moveStrategy) {
        this.cars = cars;
        this.count = count;
        this.moveStrategy = moveStrategy;
    }

    public void letsRace() {
        for (int i = 0; i < count; i++) {
            cars.forEach(car -> car.move(moveStrategy));
            Result.printState(cars);
        }
    }

    public List<Car> findWinner() {

        return cars.stream().filter(car -> car.getMove() == maxMove())
                .collect(Collectors.toList());

    }

    private int maxMove() {
      return cars.stream().map(Car::getMove)
                .reduce(0,Math::max);
    }

}
