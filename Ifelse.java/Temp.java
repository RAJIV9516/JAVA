import java.util.Scanner;

public class Temp {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
     System.out.println("enter a temp ");
     Double temp;
     String choice;
     temp=obj.nextDouble();
     System.out.println("enter a temp type");
     obj.nextLine();
     choice=obj.nextLine();
     
     if(choice.equals("celcius")){
      temp=(temp*(9/5)+32);
     System.out.println(temp);


     }
     else if(temp.equals("farnait")){
      temp=(temp*(5/9)-32);
     System.out.println("tem in farnait");


     }
  }
}