package structuralPatterns.bridgePattern.payment;

public class BridgePatternDemo {
  public static void main(String[] args) {
    CardPayment cardPaymentUsingCityBank = new CardPayment(new CityBankPaymentSystem());
    cardPaymentUsingCityBank.makePayment();

    CardPayment cardPaymentUsingStateBank = new CardPayment(new StateBankPaymentSystem());
    cardPaymentUsingStateBank.makePayment();

    NetBankingPayment netBankingPaymentUsingStateBank = new NetBankingPayment(new StateBankPaymentSystem());
    netBankingPaymentUsingStateBank.makePayment();
  }
}
