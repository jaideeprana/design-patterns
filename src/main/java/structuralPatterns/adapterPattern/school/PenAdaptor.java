package structuralPatterns.adapterPattern.school;

import structuralPatterns.adapterPattern.school.notCompatibleLib.ParkerPen;

/*
 Adaptor class
 and
 Pen is the target class
*/
public class PenAdaptor implements Pen {
/*
 Adaptee class
*/
  private final ParkerPen parkerPen;

  public PenAdaptor(ParkerPen parkerPen) {
    this.parkerPen = parkerPen;
  }

  @Override
  public void write(String str) {
    parkerPen.writeSmoothly(str);
  }
}
