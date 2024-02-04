package org.example.context;

import org.example.context.enm.EnumThreadLocalContext;
import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumContextTest {

    private static final String VALUE_FIRST = "VALUE FIRST";
    private static final String VALUE_SECOND = "VALUE SECOND";

    @Test
    void enumContextTestInitial() throws Exception {
        EnumThreadLocalContext.INSTANCE.setValue(VALUE_FIRST);
        sleep(3000);
        assertEquals(VALUE_FIRST, EnumThreadLocalContext.INSTANCE.getValue());
    }

    @Test
    void enumContextTestOverride() throws Exception {
        sleep(1000);
        EnumThreadLocalContext.INSTANCE.setValue(VALUE_SECOND);
        sleep(3000);
        assertEquals(VALUE_SECOND, EnumThreadLocalContext.INSTANCE.getValue());
    }
}
