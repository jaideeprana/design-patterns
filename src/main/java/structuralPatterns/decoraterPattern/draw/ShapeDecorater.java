package structuralPatterns.decoraterPattern.draw;

public abstract class ShapeDecorater implements Shape {
    private Shape decoratedShape;

    public ShapeDecorater(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
