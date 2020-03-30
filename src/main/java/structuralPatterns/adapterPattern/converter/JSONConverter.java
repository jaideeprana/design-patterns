package structuralPatterns.adapterPattern.converter;

public class JSONConverter {
    public JSON convert(String file) {
        return new JSON("Created by JD", file);
    }
}
