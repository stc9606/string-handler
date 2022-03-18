package com.handler.parse.dao;

import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public enum ExposureType {
    REMOVE_HTML(str -> str.replaceAll(Constants.REMOVE_TAG_PATTENR, Constants.EMPTY)),
    ALL_TEXT(str -> str);

    private final Function<String, String> function;

    public String getExposedHtml(final String str) {
        return function.apply(str);
    }

    private static class Constants {
        public static final String REMOVE_TAG_PATTENR = "<[^>]*>";
        public static final String EMPTY = "";
    }
}
