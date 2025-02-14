import java.util.Scanner;

public class Palindrome{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);

int number=12321;
int org=number;
int rv=0;
int digit=0;
while (number!=0) {
  digit=number%10;
  rv=rv*10+digit;
  number=number/10;  
}
if(rv==org){
  System.out.println("palindrome");
}
else{
  System.out.println("not palindrome");
  
}
}
}