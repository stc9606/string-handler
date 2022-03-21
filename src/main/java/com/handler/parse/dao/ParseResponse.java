package com.handler.parse.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ParseResponse {
    private final String quotient;
    private final String remainder;

    public ParseResponse(OutputUnit outputUnit) {
        this.quotient = outputUnit.getQuotient();
        this.remainder = outputUnit.getRemainder();
    }
}
