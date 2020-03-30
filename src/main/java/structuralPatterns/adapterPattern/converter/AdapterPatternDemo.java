package structuralPatterns.adapterPattern.converter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        XMLConverter xmlConverter = new XMLConverter();

        XMLToJSONAdapter xmlToJSONAdapter = new XMLToJSONAdapter(xmlConverter);

        JSON dopeJSON = xmlToJSONAdapter.convertToJSON(new XML("Metadata by Mr. JD", "Doope content"));

        System.out.println("Dope content of JSON: " + dopeJSON.getContent());
        System.out.println("Dope metadata of JSON: " + dopeJSON.getMetaData());
    }
}
