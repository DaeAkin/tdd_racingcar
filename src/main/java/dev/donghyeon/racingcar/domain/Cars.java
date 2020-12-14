package dev.donghyeon.racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private Cars() {
    }

    public static List<Car> from(List<String> carNames) {
        return prepareCar(carNames);
    }

    private static List<Car> prepareCar(List<String> carNames) {
        return carNames.stream().map(Car::new)
                .collect(Collectors.toList());
    }
}
