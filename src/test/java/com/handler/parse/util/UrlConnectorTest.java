package com.handler.parse.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;


class UrlConnectorTest {

    private final UrlConnector urlConnector = new UrlConnector();

    @DisplayName("Get Html to Url is")
    @ParameterizedTest
    @CsvSource({"https://www.naver.com, <title>NAVER</title>", "https://www.google.com, <title>GOOGLE</title>"})
    void urlSuccessTest(final String url, final String title) {
        final String result = urlConnector.getHtml("https://www.naver.com");

        Assertions.assertThat(result.contains("<title>NAVER</title>")).isTrue();
    }

    @DisplayName("Get Html to Url is")
    @Test
    void urlFailTest() {
        Assertions.assertThatThrownBy(() -> urlConnector.getHtml("wrong.url.ccc"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}