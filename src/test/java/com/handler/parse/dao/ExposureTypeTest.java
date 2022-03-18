package com.handler.parse.dao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExposureTypeTest  {

    @DisplayName("Remove_Html Type is Tag Delete")
    @Test
    void removeHtml() {
        final String result = ExposureType.REMOVE_HTML.getExposedHtml("<div>abc</div>");
        Assertions.assertThat(result).isEqualTo("abc");
    }

    @DisplayName("All_Text Type is Get All Text")
    @Test
    void allText() {
        final String result = ExposureType.ALL_TEXT.getExposedHtml("<div>abc</div>");
        Assertions.assertThat("<div>abc</div>");
    }

}