package dev.donghyeon.racingcar.domain;

import lombok.ToString;

@ToString
public class Car {
    private String name;
    private String move = "";

    public Car(String name) {
        if(name.length() > 5)
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        this.name = name;
    }

    public void move(int randomCount) {
        if(randomCount > 9)
            throw new IllegalArgumentException("count는 9를 초과할 수 없습니다.");
        if(randomCount >= 4)
            move += "-";

        System.out.println(toString());
    }


    public String getMove() {
        return move;
    }

    public String getName() {
        return name;
    }
}
