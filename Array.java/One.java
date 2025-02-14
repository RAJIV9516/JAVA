import java.util.Scanner;

public class One{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);

        //    Declaration
        // int arr[]={1,2,3,4,5};
        // System.out.println(arr[0]);
        // int []arr={1,2,3,4,5};
        // System.out.println(arr[0]);
        // int[] arr={1,2,3,4,5};
        // System.out.println(arr[0]);
        // int[]arr={1,2,3,4,5};
        // System.out.println(arr[0]); 
        // int arr[5];wrong Declaration

        // Creation
        // int arr[]=new int[5];
        // int arr[];
        // arr=new int[5];

        // Initalization
        // int arr[]=new int[]{1,2,3,4,5};
        //    int arr[]={1,2,3,4,5};

        // int arr[]={1,2,3,4,5};

        //   Retrival
        // for(int i=0; i<5; ++i){
        //     System.out.println(arr[i]);
        // }

    //  for(int i:arr){
    //     System.out.println(i);

    // }


    int size=0;
    System.out.println("enter size of an array");
    size=obj.nextInt();
    int arr[]=new int[size];
    for(int i=0; i<arr.length;++i){
        arr[i]=obj.nextInt();   
    }
}
}
