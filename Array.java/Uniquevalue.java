import java.util.Scanner;

public class Uniquevalue{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);
        //    Duplicate of array
       
           int arr[]=new int[]{1,2,1,3,2,4};

           for(int i=0; i<arr.length; ++i){
              boolean dup=false;
            for(int j=i+1; j<arr.length;++j){
               if(arr[i]==arr[j]){
                  arr[j]=-1;
                  dup=true;
               }
            }
            if(!dup && arr[i]!=-1){
               System.out.println(arr[i]);
            }
           }
           }
         }