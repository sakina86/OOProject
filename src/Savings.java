public class Savings extends Account {
// * safetyDepositBoxID - represents a safety deposit box id
//   * safetyDepositBoxPin - represents a safety deposit box pin
    int safetyDepositBoxID;
    int safetyDepositBoxPin;

     // takes name, ssn, balance as parameters and initializes them through superclass constructor
    //	 * changes the accountNumber by adding 2 before it since savings accounts must start with 2.
    //   * initializes safetyDepositBoxID by generating and assigning a 3-digit random number.
    //	 * initializes safetyDepositBoxPin by generating and assigning a 4-digit random number.
    //	 * sets the interest rate for Savings account class by calling setInterestRate() method.
    public Savings(String name, String ssn, double balance) {
        super(name, ssn, balance);
        accountNumber=2+generateAccountNumber();
        safetyDepositBoxID = (int)(100+Math.random()*900);
        safetyDepositBoxPin = (int)(1000+Math.random()*9000);
        setInterestRate();

    }

  
     public String showInfo(){
        return super.showInfo()+"\nACCOUNT TYPE: SAVINGS "+"\nSAFETY DEPOSIT BOX ID: "+ safetyDepositBoxID+"\nSAFETY DEPOSIT BOX PIN: "+ safetyDepositBoxPin+"\nINTEREST RATE: "+interestRate+"%";
     }
  
////setInterestRate() - an abstract method that is inherited from BaseInterestRate interface. Must be implemented as:
//     This class's interestRate must be set as 0.25 less than the super class's interestRate.
    @Override
    public void setInterestRate() {
    this.interestRate = super.interestRate - 0.25;
    
    }
  
}
