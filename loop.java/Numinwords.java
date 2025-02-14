import java.util.Scanner;

public class Numinwords{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int n;
System.out.println("Enter your number to convert into string");
n=obj.nextInt();
int rv=0;
int d1;
int newno;
int digit;
int count=0;
String result;
while(n>0){
    d1=n%10;
    rv=rv*10+d1;
    count++;
    n=n/10;

}
newno=rv;
while(count !=0){
    digit=newno%10;
       result= switch(digit){
            case 1 -> "one";
            case 2->"two";
            case 3->"three";
            case 4->"four";
            case 5->"five";
            case 6->"six";
            case 7->"seven";
            case 8->"eight";
            case 9->"nine";
            case 0->"zero";
            default->"invalid";

                

        };
        System.out.println(result);
        newno=newno/10;
        count--;



}


}
}



