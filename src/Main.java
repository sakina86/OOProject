import java.util.*;
import java.io.BufferedReader;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    
    System.out.println("******************** DUOTECH BANK ACCOUNT MANAGEMENT APPLICATION ********************");
		System.out.println("-------------------------------------------------------------------------------------");

    Scanner inp =new Scanner(System.in);
    String add = "";
     
       do{
        
         
        System.out.println("Please, enter the name of the file to load: ");
         String name = inp.next();
         System.out.println("_________________________________________________________________________");
    System.out.println("All the information has been loaded and accounts are being generated...");
    System.out.println("_________________________________________________________________________");
    System.out.println("Here's the list of bank accounts that have been created: ");
    System.out.println("_________________________________________________________________________");

      List<String[]> list = Utility.readFromCSV(name);
      for(int i=1;i<list.size();i++){
      
         if((list.get(i)[2]).equals("Savings")){
           
           Account save= new Savings(list.get(i)[0],list.get(i)[1],list.get(i)[3]);
            
            System.out.println(save.showInfo());
           System.out.println("**********************************************************");
           }else{
             Account checking = new Checking(list.get(i)[0],list.get(i)[1],list.get(i)[3]);
      
        System.out.println(checking.showInfo());
           }
  System.out.println("**********************************************************");      
        }

          System.out.println("Would you like to add another file? Yes/No");
          add =inp.next();
         
         }while (!add.equals("no"));
         System.out.println("_________________________________________________________________________");
    
    
    System.out.println();
    System.out.println();
    System.out.println("THANK YOU FOR USING DUOTECH BMA! GOODBYE!");

   
    
  }

  
}