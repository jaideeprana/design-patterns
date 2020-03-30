package structuralPatterns.adapterPattern.converter;

public class XMLToJSONAdapter {
    private XMLConverter xmlConverter;

    public XMLToJSONAdapter(XMLConverter xmlConverter) {
        this.xmlConverter = xmlConverter;
    }

    public JSON convertToJSON(XML xml) {
        String content = xml.getContent();
        String metaData = xml.getMetaData();

        return new JSON(parseMetaData(metaData), parseContent(content));
    }

    private String parseMetaData(String metaData) {
        String partiallyParsed = metaData.replace("<metaData>", "");
        return partiallyParsed.replace("</metaData>", "");
    }

    private String parseContent(String content) {
        String partiallyParsed = content.replace("<content>", "");
        return partiallyParsed.replace("</content>", "");
    }
}
