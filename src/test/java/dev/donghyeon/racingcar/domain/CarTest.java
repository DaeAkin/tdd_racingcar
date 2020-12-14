package dev.donghyeon.racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("Car 객체 생성 유효성 테스트")
    void create_test() {
        new Car("car");
    }

    @Test
    @DisplayName("Car 객체 생성 유효성 테스트")
    void create_fail_test() {
        new Car("car123");
    }
}
