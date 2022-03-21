package com.handler.parse.controller;

import com.handler.parse.dao.ParseRequest;
import com.handler.parse.dao.ParseResponse;
import com.handler.parse.service.ParseService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ParseController {

    private final ParseService parseService;

    @Operation(summary = "Url Data Process", description = "Url Parsing 후 HTML 데이터 가공")
    @PostMapping("api/parse")
    public ResponseEntity<ParseResponse> parse(@RequestBody @Valid ParseRequest request) {
        final ParseResponse response = parseService.parse(request);

        return ResponseEntity.ok(response);
    }
}
