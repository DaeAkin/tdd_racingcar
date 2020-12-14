package dev.donghyeon.racingcar.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

    private StringUtils() {
    }

    public static List<String> splitName(String names) {
        return Arrays.stream(names.split(",")).collect(Collectors.toList());
    }
}
