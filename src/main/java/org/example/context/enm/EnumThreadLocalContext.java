package org.example.context.enm;

import java.util.HashMap;
import java.util.Map;

public enum EnumThreadLocalContext {

    INSTANCE;

    private final ThreadLocal<Map<String, String>> store = ThreadLocal.withInitial(HashMap::new);

    public void setValue(String value) {
        getStore().put("KEY", value);
    }

    public String getValue() {
        return getStore().get("KEY");
    }

    private Map<String, String> getStore() {
        return store.get();
    }
}
