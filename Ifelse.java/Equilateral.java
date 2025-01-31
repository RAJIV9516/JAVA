import java.util.Scanner;

public class Equilateral{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int s1;
int s2;
int s3;
s1=obj.nextInt();
s2=obj.nextInt();
s3=obj.nextInt();
String result;
if(s1==s2 && s1==s3){

System.out.println("equilateral");

}
else{
System.out.println("not");

}
// result=((s1==s2 && s1==s3))?"equilateral":"not";
// System.out.println(result);
}
}
