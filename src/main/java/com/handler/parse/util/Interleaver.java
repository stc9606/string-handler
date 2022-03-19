package com.handler.parse.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Iterator;

@Component
public class Interleaver {

    private static final String DELMITER = "";

    String interleave(final String str1, final String str2) {
        final StringBuilder sb = new StringBuilder();

        final Iterator<String> iterable1 = Arrays.stream(str1.split(DELMITER)).iterator();
        final Iterator<String> iterable2 = Arrays.stream(str2.split(DELMITER)).iterator();

        while(iterable1.hasNext() || iterable2.hasNext()) {
            if (iterable1.hasNext()) {
                sb.append(iterable1.next());
            }
            if (iterable2.hasNext()) {
                sb.append(iterable2.next());
            }
        }

        return sb.toString();
    }

    public String interleave(Arranger arranger) {
        return interleave(arranger.getSortedEnglish(), arranger.getSortedNumber());
    }
}
