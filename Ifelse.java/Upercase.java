import java.util.Scanner;

public class Upercase {
   public Upercase() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter character");
      char var2 = var1.nextLine().charAt(0);
      // System.out.println(var2 >= 'A' && var2 <= 'Z' ? (char)(var2 + 32) : (char)(var2 - 32));
      if(var2 >= 'A' && var2 <= 'Z')
      {
         System.out.println((char)(var2 + 32));
      }
      else
      {
         System.out.println("wrong input");
      }
   }
}
