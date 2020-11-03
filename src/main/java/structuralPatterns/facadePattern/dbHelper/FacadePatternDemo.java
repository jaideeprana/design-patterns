package structuralPatterns.facadePattern.dbHelper;

public class FacadePatternDemo {
  public static void main(String[] args) {
    String tableName="Employee";

    // Generating MySql HTML report and Oracle PDF report without using Facade
    String con = MySqlHelper.getMySqlDBConnection();
    MySqlHelper mySqlHelper = new MySqlHelper();
    mySqlHelper.generateMySqlHTMLReport(tableName, con);

    String con1 = OracleHelper.getOracleDBConnection();
    OracleHelper oracleHelper = new OracleHelper();
    oracleHelper.generateOraclePDFReport(tableName, con1);

    // Generating MySql HTML report and Oracle PDF report using Facade
    HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
    HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
  }
}
