package behaviourPatterns.interpreterPattern.binaryAndHex;

public class InterpreterClient {
  public InterpreterContext ic;

  public InterpreterClient(InterpreterContext i){
    this.ic=i;
  }

  public String interpret(String str){
    Expression exp = null;
    //create rules for expressions
    int input = Integer.parseInt(str.substring(0, str.indexOf(" ")));
    if(str.contains("Hexadecimal")){
      exp=new IntToHexExpression(input);
    }else if(str.contains("Binary")){
      exp=new IntToBinaryExpression(input);
    }else return str;

    return exp.interpret(ic);
  }
}
