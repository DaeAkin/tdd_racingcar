package dev.donghyeon.racingcar.view;

import dev.donghyeon.racingcar.domain.Car;
import dev.donghyeon.racingcar.domain.Cars;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Result {
    private static final String COLON = ":";
    private static final String HYPHEN = "-";
    private static final String COMMA = ",";
    private static final String WINNER_NOTICE_MESSAGE = "가 최종 우승했습니다";

    private Result() {
    }

    public static void printState(Cars cars) {
        cars.stream()
                .forEach(car -> System.out.println(
                        car.getName() + COLON + printHyphen(car.getMove())));
        System.out.println();
    }

    private static String printHyphen(int position) {
        return IntStream.rangeClosed(1, position)
                .mapToObj(s -> HYPHEN)
                .collect(Collectors.joining(""));
    }

    public static void printWinner(List<Car> winner) {
        String winnerNames =
                winner.stream()
                        .map(Car::getName)
                        .collect(Collectors.joining(COMMA));
        System.out.println(winnerNames + WINNER_NOTICE_MESSAGE);
    }


}
