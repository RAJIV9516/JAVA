import java.util.Scanner;

public class Palindrom{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);
        //    Palindrom of array
       
           int arr[]=new int[]{1,2,3,2,1};

           int start=0;
           int end=arr.length-1;
           while(start<end){
            if(arr[start]!=arr[end]){
                System.out.println("not palindrom");
                return;
            }
            start++;
            end--;

           }

           System.out.println("pallindrome");
           }
        }
