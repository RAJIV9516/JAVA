import java.util.Scanner;

public class Mini{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
System.out.println("database system");
int age;
String name;
String uid;
char bg;
System.out.println("enter age name uid bg");
age=obj.nextInt();
name=obj.nextLine();
uid=obj.nextLine();
bg=obj.nextLine();
System.out.println("the value is"+age+" "+name+" "+uid+" "+bg);
     
}
}  