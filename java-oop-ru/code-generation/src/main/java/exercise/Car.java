package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Getter
@Setter
@AllArgsConstructor
// END
class Car {
    private int id;
    private String brand;
    private String model;
    private String color;
    private User owner;

    // BEGIN
    public String serialize(Car car) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(car);
    }
    public static Car unserialize(String jsonFormat) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonFormat, Car.class);
    }
    // END
}
