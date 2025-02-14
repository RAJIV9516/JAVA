import java.util.Scanner;

public class Armstrong{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);

    int sum=0;
    int number=153;
    int digit=0;
    int newno=number;
    while (number !=0) {
        digit=number%10;
        sum=sum+(digit*digit*digit);
        number=number/10;
        
    }
    if(newno==sum){
        System.out.println("armstron number");
    }
    else{
        System.out.println("not");

    }
}
}
