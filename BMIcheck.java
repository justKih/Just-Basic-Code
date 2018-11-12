/**
 Homework assignment from wednesday(Lab 8)
*Create a BMI checker
*using converters
*
*Derrick Burgess
*
*4/18/18
*/
import javax.swing.JOptionPane;

public class BMIcheck
{
   public static void main(String[] args)
   {
      String whatsLength;
      String whatsWeight;
      double heightFt;
      double massKg;
      double BMI;
      double length;
      double weight;
      
      //this gives length in inches
      //must be input value
      whatsLength = JOptionPane.showInputDialog("Type your length(inches):");
      length = Double.parseDouble(whatsLength);
      
      //this gives weight in pounds
      //must input value
      whatsWeight = JOptionPane.showInputDialog("Type your weight(pounds):");
      weight = Double.parseDouble(whatsWeight);
      
      //This converts inches to feet
      heightFt = length * 0.0254;
      
      //This converts poungs to kilograms
      massKg = weight * 0.45359237;
      
      //This is the BMI
      BMI = massKg / heightFt * heightFt;
      
      if (BMI < 18.5)                 //If BMI is under 18.5, your unbderweight
         JOptionPane.showMessageDialog(null, "OHH GOD, your underweight");
         
      else if (BMI >= 18.5 && BMI < 25)   //If BMI is between 18.5 and 25, your normal
         JOptionPane.showMessageDialog(null, "Its cool, your normal");
         
      else if (BMI >= 25 && BMI < 30)     //If BMI is between 25 and 30, your overweight
         JOptionPane.showMessageDialog(null, "Looks like your falling a little overweight there!?");
         
      else if (BMI >= 30)             //If BMI is over 30.....your obese
         JOptionPane.showMessageDialog(null, "HOLY CRAP, SOUND THE ALARM, YOUR OBESE");
      
      
      System.exit(0);
   }
}