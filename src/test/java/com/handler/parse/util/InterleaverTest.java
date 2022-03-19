package com.handler.parse.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class InterleaverTest {

    private final Interleaver interleaver = new Interleaver();

    @ParameterizedTest
    @CsvSource({
            "aaaaaabbbbbbcccccc, 1111111222222333333, a1a1a1a1a1a1b1b2b2b2b2b2c2c3c3c3c3c33",
            "adddddefhjjjju, 122222333344788889, a1d2d2d2d2d2e3f3h3j3j4j4j7u88889"
    })
    void test(final String str1, final String str2, final String result) {
        Assertions.assertThat(interleaver.interleave(str1, str2)).isEqualTo(result);
    }
}