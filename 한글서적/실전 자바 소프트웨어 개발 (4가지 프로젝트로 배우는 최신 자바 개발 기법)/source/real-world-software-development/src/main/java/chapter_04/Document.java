package chapter_04;

import java.util.Map;

public class Document {

    private final Map<String, String> attributes;

    Document(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public String getAttribute(final String attributeName) {
        return attributes.get(attributeName);
    }
}
