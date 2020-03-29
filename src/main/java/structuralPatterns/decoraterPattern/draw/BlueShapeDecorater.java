package structuralPatterns.decoraterPattern.draw;

public class BlueShapeDecorater extends ShapeDecorater {
    public BlueShapeDecorater(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Applied blue border");
    }
}
