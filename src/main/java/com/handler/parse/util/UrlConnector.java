package com.handler.parse.util;

// static method vs @Component

import com.handler.parse.error.UrlConnectionException;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UrlConnector {

    public String getHtml(final String url) {
        //jsoup -> 장/단점 조사
        try {
            return Jsoup.connect(url).get().html();
        } catch (IOException e) {
            throw new UrlConnectionException("접근할 수 없는 Url입니다.");
        }
    }
}
