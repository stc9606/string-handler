package com.handler.parse.service;

import com.handler.parse.dao.ParseRequest;
import com.handler.parse.dao.ParseResponse;
import com.handler.parse.util.UrlConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParseService {

    private final UrlConnector urlConnector;

    public ParseResponse parse(ParseRequest request) {
        final String html = urlConnector.getHtml(request.getUrl());

        return null;
    }
}
