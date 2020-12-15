package dev.donghyeon.racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {

    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Stream<Car> stream() {
        return cars.stream();
    }

    public static Cars from(List<String> carNames) {
        return prepareCar(carNames);
    }

    private static Cars prepareCar(List<String> carNames) {
        List<Car> cars = carNames.stream().map(Car::new)
                .collect(Collectors.toList());

        return new Cars(cars);
    }
}
