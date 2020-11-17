package structuralPatterns.adapterPattern.school;

public class AssignmentWork {
  private final Pen pen;

  public AssignmentWork(Pen pen) {
    this.pen = pen;
  }

  public void writeAssignment(String str) {
    pen.write(str);
  }
}
