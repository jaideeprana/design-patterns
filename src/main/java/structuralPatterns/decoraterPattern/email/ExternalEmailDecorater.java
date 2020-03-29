package structuralPatterns.decoraterPattern.email;

public class ExternalEmailDecorater extends EmailDecorater {
    public ExternalEmailDecorater(IEmail decoratedEmail) {
        super(decoratedEmail);
    }

    @Override
    public String getContent() {
        String content = super.getContent();
        String enrichedContent = "This email if for the public: " + content;
        System.out.println(enrichedContent);
        return enrichedContent;
    }
}
