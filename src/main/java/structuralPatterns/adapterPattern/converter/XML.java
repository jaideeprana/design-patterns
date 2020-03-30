package structuralPatterns.adapterPattern.converter;

public class XML {
    public String metaData;
    public String content;

    public XML(String metaData, String content) {
        this.metaData = "<metaData>" + metaData + "</metaData>";
        this.content = "<content>" + content + "</content>";
    }

    public String getMetaData() {
        System.out.println("XML metadata: " + metaData);
        return metaData;
    }

    public String getContent() {
        System.out.println("XML content: " + content);
        return content;
    }
}
