package structuralPatterns.decoraterPattern.email;

public class Email implements IEmail {
    @Override
    public String getContent() {
        return "A sample E-mail";
    }
}
