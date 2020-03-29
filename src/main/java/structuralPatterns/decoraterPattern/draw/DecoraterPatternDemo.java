package structuralPatterns.decoraterPattern.draw;

public class DecoraterPatternDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        RedShapeDecorater redShapeDecorater = new RedShapeDecorater(rectangle);
        redShapeDecorater.draw();

        BlueShapeDecorater blueShapeDecorater = new BlueShapeDecorater(rectangle);
        blueShapeDecorater.draw();

        blueShapeDecorater = new BlueShapeDecorater(new Circle());
        blueShapeDecorater.draw();
    }
}
