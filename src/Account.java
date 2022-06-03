public abstract class Account implements BaseInterestRate {

  protected String name; 
  protected String ssn;
  protected String balance; 
  protected String accountNumber;
  protected long routingNumber;
  protected double interestRate;


  public Account (String name, String ssn, String balance) {
  this.name = name;
  this.ssn = ssn;
  this.balance = balance;
  this.accountNumber= generateAccountNumber();
  this.routingNumber= generateRoutingNumber();
  this.interestRate=getBaseInterestRate();
}

  public String generateAccountNumber(){
    String result="";
   int num = (int)((Math.random() * 900000000)+1000000000);
     result =ssn.substring(ssn.length()-4) + num;
     return result;
  }
  
	public long generateRoutingNumber(){
    int num = (int)((00+Math.random() * 9000000)+100000000);
    return num;
  }

  public void deposit (double amount){
    balance = amount + balance;
   System.out.println(balance);   
  }

  // public void withdraw (double amount){
  //   if (amount <= balance){
  //   System.out.println ( balance - amount);
  //   }
  //   else if (amount > (balance)){
  //     System.out.println("ERROR"); 
  //   }
  //   }
  
  public String showInfo() {
    return "NAME: " + name + "\n" + "SSN: " + ssn + "\n" + "ACCOUNT NUMBER: " + accountNumber + "\n" + "ROUTING NUMBER: " + routingNumber + "\n" + "BALANCE: " + balance;
   }

}