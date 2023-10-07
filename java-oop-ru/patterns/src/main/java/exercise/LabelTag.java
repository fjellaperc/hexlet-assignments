package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String nameTag;
    private TagInterface tag;
    LabelTag(String nameTag, TagInterface tag) {
        this.nameTag = nameTag;
        this.tag = tag;
    }
    @Override
    public String render() {
        return "<label>" + nameTag + tag.render() + "</label>";
    }
}
// END
