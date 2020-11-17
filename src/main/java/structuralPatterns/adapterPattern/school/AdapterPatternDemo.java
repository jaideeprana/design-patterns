package structuralPatterns.adapterPattern.school;

import structuralPatterns.adapterPattern.school.notCompatibleLib.ParkerPen;

/*
 Makes two incompatible interfaces work together
*/
public class AdapterPatternDemo {
  public static void main(String[] args) {
    Pen pen = new PenAdaptor(new ParkerPen());
    /*
     The assignment class expects a pen implementation instead of Parker pen implementation
    */
    AssignmentWork assignmentWork = new AssignmentWork(pen);

    assignmentWork.writeAssignment("My awesome assignment");
  }
}
