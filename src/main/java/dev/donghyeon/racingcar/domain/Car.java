package dev.donghyeon.racingcar.domain;

import lombok.ToString;

@ToString
public class Car {
    private String name;
    private int move;

    public Car(String name) {
        if(name.length() > 5)
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        this.name = name;
    }

    public void move(MoveStrategy moveStrategy) {
        if(moveStrategy.isMoveAble())
            move++;
    }


    public int getMove() {
        return move;
    }

    public String  getName() {
        return name;
    }
}
