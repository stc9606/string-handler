package com.handler.parse.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    private final Sorter sorter = new Sorter();

    @DisplayName("영어를 정렬할 때 AaBb 오름차순 순서로 정렬한다.")
    @Test
    void englishSortTest() {
        final String result = sorter.sort("DfkeiosdFjkeisadTkfdciovsdf");

        Assertions.assertThat(result).isEqualTo("acDddddeeFfffiiijkkkoosssTv");
    }

    @DisplayName("숫자를 정렬할 때 0-9 오름차순 순서로 정렬한다.")
    @Test
    void numberSortTest() {
        final String result = sorter.sort("394234923874238947112378123905");

        Assertions.assertThat(result).isEqualTo("011122222333333444457778889999");
    }
}