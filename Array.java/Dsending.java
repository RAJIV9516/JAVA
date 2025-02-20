import java.util.Scanner;

public class Dsending{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);

           int arr[]=new int[]{1,3,4,5,2};
           int max=arr[0];

           for(int i=0; i<arr.length; ++i){
            for(int j=i+1; j<arr.length;++j){
               if(arr[i]<arr[j]){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp; 
               }
            }
            // System.out.print(arr[i]);

           }
           for(int i:arr){
            System.out.print(i+" ");
           }
          
           }
         }
