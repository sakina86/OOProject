//BASE_INTEREST_RATE - a constant that represents the base interest rate for all bank account types set by the Federal Reserve.
// Must be initialized to 2.5.
public interface BaseInterestRate {
    public static double BASE_INTEREST_RATE = 2.5;

    //getBaseInterestRate() - a default method that returns the BASE_INTEREST_RATE.
     default double getBaseInterestRate(){
        return BASE_INTEREST_RATE;
    }
//setInterestRate() - an abstract void method that will be implemented by the concrete classes to set the specific interest rate for that account type.
     void setInterestRate();
}
