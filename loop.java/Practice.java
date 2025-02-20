import java.util.Scanner;

public class Practice{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);

           int arr[]=new int[]{1,0,2,0,3,0};
           int k=0;
           for(int i=0; i<arr.length;++i){
            if(arr[i]!=0){
               arr[k]=arr[i];
               k++;
            }
           }
           for(int i=k;i<arr.length;++i){
            arr[i]=0;
           }
           for(int i=0;i<arr.length;++i){
            System.out.println(arr[i]);
           }
           }
         }

