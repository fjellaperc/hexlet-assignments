package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static Map<String, String> swapKeyValue(KeyValueStorage memory) {
        Map<String, String> cloneMap = memory.toMap();
        Set<String> keySet = memory.toMap().keySet();
        for (String key : keySet) {
            memory.unset(key);
            memory.set(cloneMap.get(key), key);
        }
        return memory.toMap();
    }
}
// END
