package structuralPatterns.adapterPattern.converter;

public class JSON {
    private final String metaData;
    private final String content;

    public JSON(String metaData, String content) {
        this.metaData = metaData;
        this.content = content;
    }

    public String getMetaData() {
        return metaData;
    }

    public String getContent() {
        return content;
    }
}
