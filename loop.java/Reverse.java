import java.util.Scanner;

public class Reverse{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);

int number=1234;
int rv=0;
int digit=0;
while (number!=0) {
  digit=number%10;   
  rv=rv*10+digit;          
  number=number/10;  
}
System.out.println(rv);

}
}
