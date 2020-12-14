package dev.donghyeon.racingcar;

import dev.donghyeon.racingcar.controller.CarController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RacingcarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RacingcarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CarController carController = new CarController();
        carController.doRace();
    }
}
