package org.example.context.cls;

import java.util.HashMap;
import java.util.Map;

public class ClassThreadLocalContext {

    private final Map<String, String> store;
    private static final ThreadLocal<ClassThreadLocalContext> INSTANCE = ThreadLocal.withInitial(ClassThreadLocalContext::new);

    private ClassThreadLocalContext() {
        store = new HashMap<>();
    }

    public static ClassThreadLocalContext getInstance() {
        return INSTANCE.get();
    }

    public void setValue(String value) {
        store.put("KEY", value);
    }

    public String getValue() {
        return store.get("KEY");
    }
}
