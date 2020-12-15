package dev.donghyeon.racingcar.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

    @Test
    @DisplayName("Car 객체 생성 유효성 테스트")
    void create_test() {
        new Car("car");
    }

    @ParameterizedTest
    @DisplayName("Car 객체 생성 유효성 테스트")
    @ValueSource(strings = {"자바다섯글자이상","포르쉐를사고싶어요"})
    void create_fail_test(String name) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Car(name);
        });
    }

    @Test
    @DisplayName("Car 움직이기 테스트")
    void car_move_test() {
        Car car = new Car("car");
        car.move(() -> true);

        Assertions.assertEquals(car.getMove(),1);
    }

}
