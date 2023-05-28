import value.ExpValue;

import java.util.LinkedHashMap;
import java.util.Map;

public class Conf {

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
        return (ExpValue<?>) map.entrySet().toArray()[map.size() -1];
    }
}
