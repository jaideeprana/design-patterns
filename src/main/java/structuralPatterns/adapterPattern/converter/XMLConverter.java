package structuralPatterns.adapterPattern.converter;

public class XMLConverter {
    public XML convert(String file){
        return new XML("Created by JD", file);
    }
}
