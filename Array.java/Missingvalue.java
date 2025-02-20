import java.util.Scanner;

public class Missingvalue{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);
        //    Missingvalue of array
       
           int arr[]=new int[]{1,5,9,15};

           for(int i=0; i<arr.length; ++i){
            if(arr[i+1]-arr[i]>1){
               for(int j=arr[i]+1; j<arr[i+1]; ++j)
               System.out.println(j);
            }
           }
           }
         } 