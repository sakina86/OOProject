import java.io.*;
import java.util.*;


public class Utility{

  public static List<String[]> readFromCSV(String str) throws IOException{
  List<String[]> result = new ArrayList<>();
    try{
    BufferedReader br = new BufferedReader(new FileReader(str));
    
    String strConv;
    
    while((strConv=br.readLine()) !=null){
      String[] eachrow = strConv.split(",");
      result.add(eachrow);
    }
      
    } catch (IOException e){
      System.out.println("Exception");
      }
    return result; 
    //System.out.println(result.toString());
    
    //System.out.println(result.toString());
    
  }
  
}