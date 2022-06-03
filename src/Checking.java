public  class Checking extends Account {
    String debitCardNo;
    String debitCardPIN;


//   * takes name, ssn, balance as parameters and initializes them through superclass constructor
//	 * changes the accountNumber by adding 1 before it since checking accounts must start with 1.
//   * initializes debitCardNo by calling generateDebitCardNo() method
//	 * initializes debitCardPIN by generating and assigning 4 digit random number.
//	 * sets the interest rate for Checking account class by calling setInterestRate() method.
    public Checking(String name, String ssn, double balance) {
        super(name, ssn, balance);
        accountNumber=1+accountNumber;
        debitCardNo=generateDebitCardNo();
        debitCardPIN=generatePinNo();
        setInterestRate();

    }
  ////setInterestRate() - an abstract method that is inherited from BaseInterestRate interface. Must be impemented as:
    //     This class's interestRate must be set as 15% of the super class's interestRate.
    public  void setInterestRate(){
     this.interestRate=BASE_INTEREST_RATE/100*15;
    }

  //     * generateDebitCardNo() - generates an 16-digit Debit Card number using the below formula:
//      9 + random 15 digit number
    public static String generateDebitCardNo(){
        String num ="9";
        for (int i = 0; i < 15; i++) {
            int sum = (int)(Math.random()*10);
            num+=sum;
        }
        return num;
    }
  // initializes debitCardPIN by generating and assigning 4 digit random number.
    public static String generatePinNo(){
        String res = "";
        for (int i = 0; i <4 ; i++) {
            int sum = (int)(Math.random()*10);
            res+=sum;
        }
       return res;
    }
  
  ////showInfo() - Overrides super class's showInfo() method by ADDING Checking account specific info
//	   such as account type, debitCardNo, debitCardPIN and interestRate
    public String showInfo(){
        return super.showInfo()+"\nACCOUNT TYPE: CHECKING "+ "\nDEBIT CARD NUMBER: "+ debitCardNo+"\nDEBIT CARD PIN: "+ debitCardPIN+"\nINTEREST RATE: "+ interestRate+"%";
    }
}
