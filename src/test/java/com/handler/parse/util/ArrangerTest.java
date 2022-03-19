package com.handler.parse.util;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrangerTest {

    private final Arranger arranger = new Arranger(new Separator(), new Sorter());

    @Test
    void normalCase() {
        final Arranger arrange = arranger.rearrange("e438283djdj29dja283ufdj482hd2371");

        assertAll(
                () -> Assertions.assertThat(arrange.getSortedEnglish()).isEqualTo("adddddefhjjjju"),
                () -> Assertions.assertThat(arrange.getSortedNumber()).isEqualTo("122222333344788889")
        );
    }
}