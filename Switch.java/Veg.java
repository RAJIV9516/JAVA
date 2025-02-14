import java.util.Scanner;

public class Veg{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    int var;
    System.out.println("enter choice");
    var=obj.nextInt();

    switch(var){
        case1->
        {
            System.out.println("choose between potato and tomato");
            var=obj.nextInt();
            switch(var){
                case 1->System.out.println("potato");
                case 2->System.out.println("tomato");
                 default->System.out.println("ii");


            }
        }

        case2->
        {
            System.out.println("choose between orange and banana");
            switch(var){
                case 1->System.out.println("orange");
                case 2->System.out.println("banana");
                 default->System.out.println("ii");


            }
        }

        default->System.out.println("ii");

    }



  }
}
