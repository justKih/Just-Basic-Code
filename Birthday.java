/**
 This is just test code for nothing
*
*Derrick Burgess
*
*
*1.672018.1
*/
import java.util.Scanner;




public class Birthday
{

   private int month, days, years;
   
   /**
   *This constructors builds up the basic components to the program
   */

   public Birthday()
   {
      int months;
      int days;
      int years;
   }
   
   
   public static void main(String[] arg)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Tell us about your birthday!!");
      
      System.out.print("What month were you born in?:");
      int month = keyboard.nextInt();
      
      System.out.print("How many days?:");
      int days = keyboard.nextInt();
      
      System.out.print("Your year?:");
      int years = keyboard.nextInt(); 
      
      System.out.println("You were born " + month + "/" + days + "/" + years);   
   }
}