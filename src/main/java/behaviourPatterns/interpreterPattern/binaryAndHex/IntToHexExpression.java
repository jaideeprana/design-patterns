package behaviourPatterns.interpreterPattern.binaryAndHex;

public class IntToHexExpression implements Expression {
  private final int input;

  public IntToHexExpression(int input){
    this.input =input;
  }

  @Override
  public String interpret(InterpreterContext ic) {
    return ic.getHexadecimalFormat(input);
  }
}
