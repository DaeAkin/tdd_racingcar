package dev.donghyeon.racingcar.domain;

import dev.donghyeon.racingcar.view.Input;
import dev.donghyeon.racingcar.view.Result;

import java.util.*;
import java.util.stream.Collectors;

public class RacingGame {

    public void doRace() {
        final List<String> carNames = Input.carInput();
        final int count = Input.tryInput();

        final List<Car> cars = Cars.from(carNames);
        MoveStrategy carStrategy = new CarMoveStrategy();

        CarStadium carStadium = new CarStadium(cars, count, carStrategy);
        carStadium.letsRace();

        final List<Car> winner = carStadium.findWinner();
        Result.printWinner(winner);
    }

}
