import java.util.Scanner;

public class Practice{
           public static void main(String[] args){
           Scanner obj=new Scanner(System.in);

           int var;
           System.out.println("enter a choice");
           var=obj.nextInt();

           switch(var){
            case1->{
                System.out.println("choose between patato and tamato");
                var=obj.nextInt();
                case 1->System.out.println("patato");
                case 2->System.out.println("tamato");
                default->System.out.println("ii");


            }
            case2->{
                System.out.println("choose between orange and banana");
                var=obj.nextInt();
                case 1->System.out.println("orange");
                case 2->System.out.println("banana");
                default->System.out.println("ii");

            }
            default->System.out.println("ii");
           }

}
}
