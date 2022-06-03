
public class Checking extends Account{

long debitCardNo;
int debitCardPIN;

 public Checking(String name, String ssn ,String balance){
   super (name, ssn, balance);
   super.accountNumber=1 + generateAccountNumber();
   this.debitCardNo = generateDebitCardNo();
   this.debitCardPIN = (int) (1000 + Math.random() * 9000); 
  // setInterestRate();
 }
  
  public  double setInterestRate(){
   return super.interestRate * 0.15 ;
  }

  public long generateDebitCardNo(){
        return (long) (9000000000000000l + (Math.random()*999999999999999l));
}
public String showInfo(){
 
  return super.showInfo() +"\nACCOUNT TYPE : "+ "Checking" + "\nDEBIT CARD NUMBER: " + debitCardNo + "\nDEBIT CARD PIN NUMBER: " + debitCardPIN + "\nINTEREST RATE: " + setInterestRate() + "%";
}
  
}


