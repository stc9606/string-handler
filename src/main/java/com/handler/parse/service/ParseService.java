package com.handler.parse.service;

import com.handler.parse.dao.ParseRequest;
import com.handler.parse.dao.ParseResponse;
import com.handler.parse.util.Arranger;
import com.handler.parse.util.Separator;
import com.handler.parse.util.UrlConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParseService {

    private final UrlConnector urlConnector;
    private final Arranger arranger;

    public ParseResponse parse(ParseRequest request) {
        final String html = urlConnector.getHtml(request.getUrl());
        final String exposedHtml = request.getExposureType().getExposedHtml(html);
        final Arranger rearrange = arranger.rearrange(exposedHtml);

        return null;
    }
}
