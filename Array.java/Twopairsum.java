import java.util.Scanner;

public class Twopairsum{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);

           int arr[]=new int[]{1,2,30,4,5,2};
           boolean flag=false;

           for(int i=0; i<arr.length; ++i){
            for(int j=i+1; j<arr.length;++j){
               if(arr[i]+arr[j]==60){
                 System.out.println(arr[i]+" "+arr[j]);
                 flag=true;
               }
               
            }

           }
           if(!flag){
            System.out.println("no");
           }
          
           }
         }