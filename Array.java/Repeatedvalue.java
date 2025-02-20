import java.util.Scanner;

public class Repeatedvalue{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);

           int arr[]=new int[]{1,2,3,2,1,3,4,5,3,2,1,2};
           int min=arr[0];
           for(int i=0;i<arr.length; ++i){
            if(arr[i]<min){
               min=arr[i];
            }
           }
           for(int i=0;i<arr.length;++i){
            boolean dup=false;
            int count=1;
            for(int j=i+1;j<arr.length;++j){
               if(arr[i]==arr[j]){
                  arr[j]=min-1;
                  dup=true;
                  count++;
               }
            }
            if(dup && arr[i]!=min-1){
               System.out.println("the count of"+arr[i]+" "+count);
            }
            else if(arr[i]!=min-1){
               System.out.println("the count of"+arr[i]+" "+count);

            }
           }
        
          
           }
         }
