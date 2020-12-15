package dev.donghyeon.racingcar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CarsTest {

    @Test
    public void cars_create_test() {
        List<String> carNames = Arrays.asList("car1", "car2", "car3");

        Cars cars = Cars.from(carNames);

        Assertions.assertEquals(cars.stream().count(),carNames.size());
    }
}
