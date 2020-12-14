package dev.donghyeon.racingcar.controller;

import dev.donghyeon.racingcar.domain.Car;

import java.util.*;
import java.util.stream.Collectors;

public class CarController {

    public void doRace() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names = scanner.next();
        System.out.println("시도할 회수는 몇회인가요?");
        int count = scanner.nextInt();

        List<String> stringList = splitName(names);
        List<Car> cars = prepareCar(stringList);
        CarStadium carStadium = new CarStadium(cars,count);
        carStadium.letsRace();
    }

    private List<String> splitName(String names) {
        return Arrays.stream(names.split(",")).collect(Collectors.toList());
    }

    private List<Car> prepareCar(List<String> carNames) {
        return carNames.stream().map(Car::new)
                .collect(Collectors.toList());
    }





 }
