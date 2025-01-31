import java.util.Scanner;
public class Seriess{
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      boolean var2 = true;
      byte var3;
      byte var4;
      var3 = obj.nextByte();
      var4 = obj.nextByte();
      boolean var5 = true;
      if(var3 != 0 && var4 != 0 )
      {
           System.out.println((var3 + var4) / 2);
      }
      else
      {
         System.out.println("ii");
      }
   }
}