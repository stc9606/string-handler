package com.handler.parse.dao;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ParseRequest {

    @Schema(description = "url", defaultValue = "https://www.naver.com")
    private final String url;

    @Schema(description = "노출유형", defaultValue = "REMOVE_HTML")
    private final ExposureType exposureType;

    @Schema(description = "출력 묶음 단위", defaultValue = "10")
    private final Integer unitCount;
}
