import java.util.Scanner;

public class One {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
     
    // 1.datatype int char String
    // 2.return type
    // 3.break;
    // 4.nesting blocks available here
    // 5.logicall conditions not allowed and or not or exor
    // 6.statement ,expression
    int a=1;
    int b=2;
    String result;
    result=switch(a+b){
      case 1->
      {
        System.out.println("case1");
      }
      case 3->
      {
        System.out.println("case12");
      }
      
      default-> System.out.println("defualt");
      
    };
  }
}