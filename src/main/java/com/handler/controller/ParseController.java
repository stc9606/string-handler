package com.handler.controller;

import com.handler.dao.ParseRequest;
import com.handler.dao.ParseResponse;
import com.handler.service.ParseService;
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

    @PostMapping("api/parse")
    public ResponseEntity<ParseResponse> parse(@RequestBody @Valid ParseRequest request) {
        final ParseResponse response = parseService.parse(request);

        return ResponseEntity.ok(response);
    }
}
