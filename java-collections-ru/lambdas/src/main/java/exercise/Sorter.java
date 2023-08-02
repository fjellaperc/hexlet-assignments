package exercise;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> males) {
        return males.stream()
                .filter(male -> male.get("gender").equalsIgnoreCase("male"))
                .sorted((male1 , male2) -> {
                    LocalDate date1 = LocalDate.parse(male1.get("birthday"));
                    LocalDate date2 = LocalDate.parse(male2.get("birthday"));
                    return date1.compareTo(date2);
                })
                .map(male -> male.get("name"))
                .collect(Collectors.toList());
    }
}

