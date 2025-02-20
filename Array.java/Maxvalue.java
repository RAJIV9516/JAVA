import java.util.Scanner;

public class Maxvalue{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);
              // maxmimum value in array
           int arr[]=new int[]{1,2,3,4,5,2};

             int max=arr[0];

             for(int i=0; i<arr.length; ++i){
               if(arr[i]>max){
                  max=arr[i];
                }

             }
           System.out.print(max);
           }
         }
