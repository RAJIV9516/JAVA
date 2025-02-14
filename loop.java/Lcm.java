import java.util.Scanner;

public class Lcm{
           public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);

int larger;
int smaller=0;
int lcm;
System.out.println("enter a larger number");
larger=obj.nextInt();
System.out.println("enter a smaller number");
larger=obj.nextInt();

for(int i=larger; ; i=i+larger){
        if(i%larger==0 && i%smaller==0){
            lcm=i;
            break;
    
        }
    }
    System.out.println(lcm);

}
}

// int larger;
// int smaller;
// int lcm;
// System.out.println("enter a larger number");
// larger=obj.nextInt();
// System.out.println("enter a smaller number");
// smaller=obj.nextInt();

// for(int i=larger; ; i=i+larger){
//     if(i%larger==0 && i%smaller==0){
//         lcm=i;
//         break;

//     }
// }
// System.out.println(lcm);
// }
// }














// static program
// #include <iostream>
// using namespace std;
// int main() {
//     int larger=24;
//     int smaller=16;
//     int lcm;
//     for(int i=larger; ; i=i+larger){
//         if(i%larger==0 && i%smaller==0){
//             lcm=i;
//             break;
//         }
//     }
//     cout<<lcm;
// }