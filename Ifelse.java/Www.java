import java.util.Scanner;

public class Www {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
     System.out.println("enter web name ");
     String web;
     web=obj.nextLine();

     if(web.equals("ww.tourism.com")){
      System.out.println("enter web type ");
      web=obj.nextLine();
           
           if(web.equals("international")){
            System.out.println("enter international type ");
            web=obj.nextLine();

                  if(web.equals("Virtual Private Networks")){
                       System.out.println("200");
                       
                  }
                  else if(web.equals("Proxy Servers:")){
                    System.out.println("400 ");

                  }
                  else{
                        System.out.println("no web ");
                        
                  }

           }
           else if(web.equals("Domestic")){

                  if(web.equals("Internal use")){

                  }
                  else if(web.equals("Not publicly searchable")){
                    
                  }
                  else{
                    System.out.println("no web ");
                  }

           }
           else{
                System.out.println("no web ");
           }

     }
     else{
           System.out.println("no web ");
     }
   


  }
}