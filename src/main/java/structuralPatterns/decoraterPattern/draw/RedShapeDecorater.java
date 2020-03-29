package structuralPatterns.decoraterPattern.draw;

public class RedShapeDecorater extends ShapeDecorater {
    public RedShapeDecorater(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Applied red border");
    }
}
