package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
//import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> firstBook, Map<String, String> secondBook) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : firstBook) {
            if (book.entrySet().containsAll(secondBook.entrySet())) {
                result.add(book);
            }
        }
        if (result.size() == 0)  return new ArrayList<>();
        return result;
    }
}
