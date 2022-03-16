package com.handler.parse.dao;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ParseRequest {
    private final String url;
    private final String exposureType;
    private final Integer unitCount;
}
