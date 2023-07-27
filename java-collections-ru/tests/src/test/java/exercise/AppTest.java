package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
     List<Integer> numbers;
     int size = 5;

    @BeforeEach
    void startList() {
        this.numbers = new ArrayList<>();
        this.numbers.add(1);
        this.numbers.add(2);
        this.numbers.add(3);
        this.numbers.add(4);
        this.numbers.add(5);
        this.numbers.add(6);
        this.numbers.add(7);
        this.numbers.add(8);
    }

    @Test
    void testTake() {
        List<Integer> expected = new ArrayList<>();
        /*for (int i = 0; i < size; i++) {
        expected.add(numbers.get(i));
        }*/
        expected = numbers.subList(0, size);
        Assertions.assertEquals(expected, numbers.subList(0, size));
    }
}
