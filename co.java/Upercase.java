import java.util.Scanner;

public class Upercase{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("enter character");
char b=obj.nextLine().charAt(0);
System.out.println((b>='A'&& b<='Z')?((char)(b+32)):((char)(b-32)));
}
}