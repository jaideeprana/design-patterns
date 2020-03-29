package structuralPatterns.decoraterPattern.email;

public abstract class EmailDecorater implements IEmail {
    private IEmail decoratedEmail;

    public EmailDecorater(IEmail decoratedEmail) {
        this.decoratedEmail = decoratedEmail;
    }

    @Override
    public String getContent() {
        return decoratedEmail.getContent();
    }
}
