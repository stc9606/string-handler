package com.handler.parse.dao;

import lombok.Getter;

public class OutputUnit {
    @Getter
    private final String quotient;
    @Getter
    private final String remainder;

    public OutputUnit(final String str1, final int unitCount) {
        final int length = str1.length();
        final int remainCount = length % unitCount;
        final int devideStandard = length - remainCount; // 전체 길이 - 나머지

        quotient = str1.substring(0, devideStandard);
        remainder = str1.substring(devideStandard, length);
    }
}
