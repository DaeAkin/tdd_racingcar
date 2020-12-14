package dev.donghyeon.racingcar.controller;

import dev.donghyeon.racingcar.domain.Car;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarResult {

    private static void findWinner(List<Car> cars) {
        Collections.sort(cars, (c1, c2) -> c1.getMove().length());
        Car winnerCar = cars.stream().findFirst().get();
        List<String> winners = cars.stream().filter(car -> car.getMove().equals(winnerCar.getMove()))
                .map(car -> car.getName())
                .collect(Collectors.toList());

        System.out.println(winners.toString() + "가 최종 우승했습니다.");
    }
}
