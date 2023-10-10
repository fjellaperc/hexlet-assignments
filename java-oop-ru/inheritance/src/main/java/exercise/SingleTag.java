package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    SingleTag(String nameTag, Map<String, String> attributes) {
        super(nameTag, attributes);
    }

    public String toString() {
        return super.dataFromMap();
    }
}
// END
