package dev.donghyeon.racingcar.domain;

import java.util.Random;

public class CarMoveStrategy implements MoveStrategy{

    @Override
    public boolean isMoveAble() {
        int canMove = 4;
        return new Random().nextInt(9) > canMove;
    }
}
