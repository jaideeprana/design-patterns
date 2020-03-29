package structuralPatterns.decoraterPattern.email;

public class InternalEmailDecorater extends EmailDecorater {
    public InternalEmailDecorater(IEmail decoratedEmail) {
        super(decoratedEmail);
    }

    @Override
    public String getContent() {
        String content = super.getContent();
        String enrichedContent = "This message is for internal use, don't share outside please: " + content;
        System.out.println(enrichedContent);
        return enrichedContent;
    }
}
