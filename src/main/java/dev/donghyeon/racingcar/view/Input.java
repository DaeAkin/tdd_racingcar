package dev.donghyeon.racingcar.view;

import java.util.List;
import java.util.Scanner;

import static dev.donghyeon.racingcar.utils.StringUtils.splitName;

public class Input {

    private static final String CAR_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String TRY_INPUT_MESSAGE = "시도할 회수는 몇회 인가요?";

    private static final Scanner scanner = new Scanner(System.in);

    private Input() {
    }

    public static List<String> carInput() {
        System.out.println(CAR_INPUT_MESSAGE);
        return splitName(scanner.next());
    }

    public static int tryInput() {
        System.out.println(TRY_INPUT_MESSAGE);
        return scanner.nextInt();
    }

}
