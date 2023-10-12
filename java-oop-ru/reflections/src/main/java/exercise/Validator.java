package exercise;

import java.lang.reflect.Field;
import java.util.*;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        Class<?> adr = address.getClass();
        Field[] fields = address.getClass().getDeclaredFields();
        List<String> result = new ArrayList<>();

        try {
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.get(address) == null && !field.getName().equals("flatNumber")) {
                    result.add(field.getName());
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
// END
