package com.handler.parse.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatorTest {

    private final Separator separator = new Separator();

    @DisplayName("String을 입력받으면 영어부분과 숫자부분을 얻는다.")
    @Test
    void normalCase() {
        final Separator separator1 = separator.separate("e3k4jh23kj4h23jk4h23jk42jkldji34ji");

        assertAll(
                () -> Assertions.assertThat(separator1.getEnglish()).isEqualTo("ekjhkjhjkhjkjkldjiji"),
                () -> Assertions.assertThat(separator1.getNumber()).isEqualTo("34234234234234")
        );
    }

    @DisplayName("String을 입력 받을 때 숫자와 영어 이외의 값들은 지운다.")
    @Test
   void removeSpecialChars() {
        final Separator separator2 = separator.separate("efk3$4#9^%^$#dk#f3<>9a<!@8329489cfj");

        assertAll(
                () -> Assertions.assertThat(separator2.getEnglish()).isEqualTo("efkdkfacfj"),
                () -> Assertions.assertThat(separator2.getNumber()).isEqualTo("349398329489")
        );
    }

}