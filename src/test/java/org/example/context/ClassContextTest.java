package org.example.context;

import org.example.context.cls.ClassThreadLocalContext;
import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassContextTest {

    private static final String VALUE_FIRST = "VALUE FIRST";
    private static final String VALUE_SECOND = "VALUE SECOND";

    @Test
    void classContextTestInitial() throws Exception {
        ClassThreadLocalContext.getInstance().setValue(VALUE_FIRST);
        sleep(3000);
        assertEquals(VALUE_FIRST, ClassThreadLocalContext.getInstance().getValue());
    }

    @Test
    void classContextTestOverride() throws Exception {
        sleep(1000);
        ClassThreadLocalContext.getInstance().setValue(VALUE_SECOND);
        sleep(3000);
        assertEquals(VALUE_SECOND, ClassThreadLocalContext.getInstance().getValue());
    }
}
