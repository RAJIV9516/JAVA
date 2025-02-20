import java.util.Scanner;

public class Sum{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);
        //    sum of array
           int arr[]=new int[]{1,2,3,4,5};
           int sum=0;
           for(int i=0; i<=arr.length;++i){
            sum=sum+i;
           }
           System.out.println(sum);
           }
        }
