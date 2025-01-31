import java.util.Scanner;

public class Color {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    //  System.out.println("enter ");

     String color1="red";
     String color2="black";
     String color=color1+color2;

     if(color.equals("red black")){
        System.out.println("darkred");
     }
     else{
        System.out.println("invalid color");
     }
  }
}