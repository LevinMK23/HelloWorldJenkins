package com.geekbrains.helloworld;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ArithmeticUtilsTest {

    private static Stream<Arguments> params() {
        return Stream.of(
                arguments(10, 7, 17),
                arguments(15, 10, 25),
                arguments(1, 2, 3)
        );
    }

    @DisplayName("Сумма двух чисел")
    @ParameterizedTest(name = "Тест № {index}.  {0} + {1} = {2}")
    @MethodSource("params")
    void sum(int a, int b, int expected) {
        assertEquals(expected, ArithmeticUtils.sum(a, b));
    }

}