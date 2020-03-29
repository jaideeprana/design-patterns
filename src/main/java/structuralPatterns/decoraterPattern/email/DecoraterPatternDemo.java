package structuralPatterns.decoraterPattern.email;

public class DecoraterPatternDemo {
    public static void main(String[] args) {
        InternalEmailDecorater internalEmailDecorater = new InternalEmailDecorater(new Email());
        internalEmailDecorater.getContent();

        ExternalEmailDecorater externalEmailDecorater = new ExternalEmailDecorater(new Email());
        externalEmailDecorater.getContent();
    }
}
