public interface BaseInterestRate{

  public final double BASE_INTEREST_RATE =2.5;


    public default double getBaseInterestRate(){
     return BASE_INTEREST_RATE;
  }

  public abstract double setInterestRate();
}