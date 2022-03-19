package com.handler.parse.dao;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ParseResponse {
    private final String quotient;
    private final String remainder;

    public ParseResponse(OutputUnit outputUnit) {
        this.quotient = outputUnit.getQuotient();
        this.remainder = outputUnit.getRemainder();
    }
}
