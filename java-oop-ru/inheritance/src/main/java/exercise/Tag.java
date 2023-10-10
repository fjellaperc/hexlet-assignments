package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
     private String nameTag;
     private Map<String, String> attributes;

     Tag(String nameTag, Map<String, String> attributes) {
          this.nameTag = nameTag;
          this.attributes = attributes;
     }

     public String getNameTag() {
          return nameTag;
     }

     public Map<String, String> getAttributes() {
          return attributes;
     }

     public String dataFromMap() {
          if (this.attributes.size() == 0) {
               return "<" + this.nameTag + ">";
          }
          return "<" + this.nameTag + " " + this.getAttributes().keySet().stream()
                  .map(key -> key + "=\"" + this.attributes.get(key) + "\"")
                  .collect(Collectors.joining(" ")) + ">";
     }
}
// END
