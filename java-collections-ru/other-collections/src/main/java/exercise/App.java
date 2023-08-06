package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static LinkedHashMap<String, ?> genDiff(Map<String, ?> firstMap, Map<String, ?> secondMap) {
        LinkedHashMap<String, Object> result = new LinkedHashMap<>();
        Set<String> keys1 = firstMap.keySet();
        Set<String> keys2 = secondMap.keySet();

        //Пересечение
        Set<String> unionKeys = new HashSet<>(keys1);
        unionKeys.retainAll(keys2);

        Set<String> uniqKeys1 = keys1.stream() //Есть в первом, но нет во втором (/deleted)
                .filter(x -> !keys2.contains(x))
                .collect(Collectors.toSet());
        uniqKeys1.forEach(x -> result.put(x, "deleted"));

        Set<String> uniqKeys2 = keys2.stream() //Есть во втором, но нет в первом (/added)
                .filter(x -> !keys1.contains(x))
                .collect(Collectors.toSet());
        uniqKeys2.forEach(x -> result.put(x, "added"));

        unionKeys.forEach(x -> {   //Одинаковые, но измененные
                    if (firstMap.get(x).equals(secondMap.get(x))) {
                        result.put(x, "unchanged");
                    } else {
                        result.put(x, "changed");
                    }
                });

        return result;
    }
}
//END
