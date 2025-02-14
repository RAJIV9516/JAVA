import java.util.Scanner;

public class Perfectnum{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int a;
int sum=0;
System.out.println("enter a value");
a=obj.nextInt();

for(int i=1; i<a; ++i){
    if(a%1==0){
        sum=sum+i;
    }
}
if(a==sum){
    System.out.println("perfect number");
}
else{
    System.out.println("not a perfect number");

}

}
}




// #include <iostream>
// using namespace std;
// int main() {
//     // perfect number
//     // 6
//     // 1+2+3=6
//     int a;
//     int sum=0;
//     cout<<"enter a value";
//     cin>>a;
//     for(int i =1; i<a; ++i){
//         if(a%i==0){
//           sum=sum+i; 
//         }
//     }
//     if(a==sum){
//         cout<<"perfect number";
//     }
//     else{
//         cout<<"not a perfect number";
//     }
   
// }