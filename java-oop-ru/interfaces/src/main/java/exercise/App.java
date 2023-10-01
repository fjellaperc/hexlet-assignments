package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        if (homes.isEmpty()) {
            return new ArrayList<>();
        }

        return IntStream.range(0, n).boxed()
                .map(homes::get)
                .sorted(Comparator.comparingDouble(Home::getArea))
                .map(Object::toString).toList();
    }
}

// END
