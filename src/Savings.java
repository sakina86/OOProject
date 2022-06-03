public class Savings extends Account{

  private int safetyDepositBoxID;
  private int safetyDepositBoxPin;

  public Savings(String name, String ssn, String balance){
    super(name,ssn,balance);
    super.accountNumber=2 + generateAccountNumber();
        setSafetyDepositBoxID(100 + (int)(Math.random() * 900));
        setSafetyDepositBoxPin(1000+ (int)(Math.random()*9000));
        //setInterestRate();
    }

    public int getSafetyDepositBoxID() {
        return safetyDepositBoxID;
    }

    public void setSafetyDepositBoxID(int safetyDepositBoxID) {
        this.safetyDepositBoxID = safetyDepositBoxID;
     
    }

    public int getSafetyDepositBoxPin() {
        return safetyDepositBoxPin;
    }

    public void setSafetyDepositBoxPin(int safetyDepositBoxPin) {
        this.safetyDepositBoxPin = safetyDepositBoxPin;
      
    }

    public double setInterestRate(){
       return super.interestRate -(interestRate * 0.25);
    }
    public String showInfo(){
        return  super.showInfo() +
                "\nACCOUNT TYPE: " + "Savings" +
                "\nSAFETY DEPOSIT BOX ID: " + getSafetyDepositBoxID() +
                "\nSAFETY DEPOSIT BOX PIN: " + getSafetyDepositBoxPin() +
                "\nINTEREST RATE: " + setInterestRate() + "%";

    }
    
  }
  
