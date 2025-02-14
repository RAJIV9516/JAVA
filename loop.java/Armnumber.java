import java.util.Scanner;

public class Armnumber{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);

double number=121;
double org=number;
double count=0;
double sum=0;
double digit=0;
while (number !=0) {
    number=number/10;
    count++;
    
}
System.out.println(count);

double ans=org;
while (org!=0) {
    digit=org%10;
    sum=count*number;
    org=org/10;
    
}
System.out.println(sum);
if(ans==sum){
    System.out.println("arm");
}
else{
    System.out.println("not arm");
}
}
}