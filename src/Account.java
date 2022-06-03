public abstract class Account implements BaseInterestRate{
   protected String name;
   protected String ssn;
   protected double balance;
   protected String accountNumber;
   protected String routingNumber;
   protected double interestRate;

    public Account(String name, String ssn, double balance) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        accountNumber=generateAccountNumber();
        routingNumber=generateRoutingNumber();
        interestRate = getBaseInterestRate();

    }

    public  String generateAccountNumber(){
        StringBuilder addSeven= new StringBuilder();
        for (int i = 0; i<7; i++)
            addSeven.append((int) (Math.random() * 10));

        return ssn.substring(7)+addSeven;
    }

    public static String generateRoutingNumber(){
     String account ="00";
        for (int i = 0; i < 7; i++) {
     int res = (int) (Math.random()*10);
     account+=res;
        }
        return account;
    }
    public void deposit(double Amount){
     this.balance = Amount;
        System.out.println("Current amount is: "+ this.balance);
    }
    public void withdraw(double Amount){
     if (Amount>balance){
         System.out.println("Balance $"+balance);
     }else {
         this.balance-=Amount;
         System.out.println("Current balance is"+this.balance);
     }

    }

    public String showInfo(){
        return "NAME: "+ name + "\nSSN: "+ ssn+"\nACCOUNT NUMBER: "+ accountNumber+"\nROUTING NUMBER: "+routingNumber+"\nBALANCE: "+balance;
    }
}
