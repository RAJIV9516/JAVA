import java.util.Scanner;

public class Divide{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
 int number;
System.out.println("enter a number12");

 number=obj.nextInt();
 String result;

//  result=((number%2==0 && number%4==0 && number%6==0)&&(number%8!=0))
// ?"div by 2,3,6":"not";

// System.out.println(result);
if((number%2==0 && number%4==0 && number%6==0)&&(number%8!=0))
{
System.out.println("div by 2,3,6");

}
else{
System.out.println("not");

}

}
}