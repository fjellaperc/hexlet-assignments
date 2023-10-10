package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String bodyTag;
    private List<Tag> children;
    public PairedTag(String nameTag, Map<String, String> attributes, String bodyTag, List<Tag> children) {
        super(nameTag, attributes);
        this.bodyTag = bodyTag;
        this.children = children;
    }
    String dataFromChildren() {
            return this.children.stream()
                    .map(Tag::dataFromMap).collect(Collectors.joining());
    }
    public String toString() {
        return super.dataFromMap() + this.bodyTag + dataFromChildren() + "</"
                + super.getNameTag() + ">";
    }
}
// END
