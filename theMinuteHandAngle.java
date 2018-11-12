/*
*Given a number N as input (either from a user, an array, or a file)
*that represents where the minute hand currently is on a clock.
*Your program should return the angle that is formed by the minute hand and the 12 o’clock mark on the clock.
*
*Derrick Burgess
*
*
*9/17/2018
*/
import javax.swing.JOptionPane;


public class theMinuteHandAngle
{
   
   //Constructor 
   private theMinuteHandAngle()
   {
      int number;
      String enterNumber;
   }
   
   //Methods
   public static void main(String[] args)
   {
      System.out.println("Hello, this program gives you an angle of your number chosen,"); 
      System.out.println("with the minute hand (using multiples of 5s) to the 12 on a clock");
      getNumber(); 
   } 
   
   public static void getNumber()
   {
      int number;
      String enterNumber = JOptionPane.showInputDialog(null, "What number would you like to input?");
      number = Byte.parseByte(enterNumber);
      System.out.println("Your number is " + number); 
      
      System.out.println("Based off the number you chose, your degree would be:");
      switch(number)
      {
         case 5:
            System.out.println("30");
            break;
         case 10:
            System.out.println("60");
            break;
         case 15:
            System.out.println("90");
            break;
         case 20:
            System.out.println("120");
            break;
         case 25:
            System.out.println("150");
            break;
         case 30:
            System.out.println("180");
            break;
         case 35:
            System.out.println("150");
            break;
         case 40:
            System.out.println("120");
            break;
         case 45:
            System.out.println("90");
            break;
         case 50:
            System.out.println("60");
            break;
         case 55:
            System.out.println("30");
            break;
         case 60:
            System.out.println("0");
            break; 
      }           
   }
}













