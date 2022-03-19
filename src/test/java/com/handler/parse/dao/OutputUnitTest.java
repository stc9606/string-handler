package com.handler.parse.dao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputUnitTest {

    public static final String SAMPLE_TEXT = "A1A2B3b4C5";

    @DisplayName("문자열과 자연수 unitCount가 주어질 때 몫 문자열과 나머지 문자열 부분을 얻을 수 있다.")
    @Test
    void normal() {
        final OutputUnit outputUnit = new OutputUnit(SAMPLE_TEXT, 3);

        assertAll(
                () -> Assertions.assertThat(outputUnit.getQuotient()).isEqualTo("A1A2B3b4C"),
                () -> Assertions.assertThat(outputUnit.getRemainder()).isEqualTo("5")
        );
    }

    @DisplayName("나머지가 없는 경우 나머지는 Empty")
    @Test
    void remainderEmpty() {
        final OutputUnit outputUnit = new OutputUnit(SAMPLE_TEXT, SAMPLE_TEXT.length());

        assertAll(
                () -> Assertions.assertThat(outputUnit.getQuotient()).isEqualTo(SAMPLE_TEXT),
                () -> Assertions.assertThat(outputUnit.getRemainder()).isEmpty()
        );
    }

    @DisplayName("출력 묶음 단위로 나뉘어지지 않으면 몫은 Empty")
    @Test
    void quotientEmpty() {
        final OutputUnit outputUnit = new OutputUnit(SAMPLE_TEXT, SAMPLE_TEXT.length() + 1);

        assertAll(
                () -> Assertions.assertThat(outputUnit.getQuotient()).isEmpty(),
                () -> Assertions.assertThat(outputUnit.getRemainder()).isEqualTo(SAMPLE_TEXT)
        );
    }

    @DisplayName("Parsing할 문자열이 Empty이면 몫과 나머지는 Empty이다.")
    @Test
    void allEmpty() {
        final OutputUnit outputUnit = new OutputUnit("", 1);

        assertAll(
                () -> Assertions.assertThat(outputUnit.getQuotient()).isEmpty(),
                () -> Assertions.assertThat(outputUnit.getRemainder()).isEmpty()
        );
    }

    @DisplayName("출력 묶음 단위가 0이면 ArithmeticException이 발생")
    @Test
    void devideZero() {
        Assertions.assertThatThrownBy(() -> {
            new OutputUnit(SAMPLE_TEXT, 0);
        }).isInstanceOf(ArithmeticException.class);
    }

}