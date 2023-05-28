import value.ComValue;
import value.ExpValue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class ArnoldConf {

    private final Map<String, ExpValue<?>> map = new LinkedHashMap<>();

    public boolean contains(String id) {
        return map.containsKey(id);
    }

    public ExpValue<?> get(String id) {
        return map.get(id);
    }

    public void update(String id, ExpValue<?> v) {
        map.put(id, v);
    }

    public ExpValue<?> getLast() {
        Map.Entry<String, ExpValue<?>> lastEntry = map.entrySet()
                        .stream()
                        .reduce((first, second) -> second).orElse(null);
        return lastEntry != null ? lastEntry.getValue() : null;
    }
}
