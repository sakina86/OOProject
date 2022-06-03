import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.List;
import java.util.Scanner;



class Main {
  public static void main(String[] args)throws IOException {
    
    System.out.println("******** DUOTECH BANK ACCOUNT MANAGEMENT APPLICATION ********");
		System.out.println("-------------------------------------------");

    // application logic here

     Scanner dora = new Scanner(System.in);
        String str;
        do {
            System.out.println("Please enter the name of the file to load: ");
            String file = dora.nextLine();
            System.out.println("-----------------------------------------");
            System.out.println("All the information has been loaded and account are being generated..");
            System.out.println("-----------------------------------------");
            System.out.println("Here's the list of bank accounts that have been created: ");
            System.out.println("-----------------------------------------"+(char)27 + "[33m");
            List<String[]> result = Utility.readFromCSV(file);


            for (int i = 1; i < result.size(); i++) {
            String[] name2 = result.get(i);
            String name = "";
            String ssn = "";
            String accountType = "";
            double balance;
            name = name2[0];
            ssn = name2[1];
            accountType = name2[2];
            balance = Double.parseDouble(name2[3]);
            if (accountType.equals("Checking")) {
                Checking checking = new Checking(name, ssn, balance);
                System.out.println(checking.showInfo());
            }
            if (accountType.equals("Savings")) {
                Savings savings = new Savings(name, ssn, balance);
                System.out.println(savings.showInfo());
            }
                System.out.println("***********************************************");
            }
            System.out.println("Would you like to load another file (y/n): ");
            str = dora.nextLine();
        }while (!str.equalsIgnoreCase("n"));

    System.out.println("THANK YOU FOR USING DUOTECH BMA! GOODBYE!");

 
  }

 
}