package com.handler.parse.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.jni.Error;

@Getter
@RequiredArgsConstructor
public class ErrorResponse {

    private final String errorMessage;
    private final String errorCode;
}
