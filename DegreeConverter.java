import javax.swing.JOptionPane;
/**
 *  DegreeConverter for degrees to radian
 *
 * @Derrick Burgess
 * @April 6, 2018
 */
public class DegreeConverter
{
    public static void main(String[] args)
    {
      String typeDegrees;   
      double degrees;
      double Pi = 3.14159;
      double radian;       
        
      typeDegrees = JOptionPane.showInputDialog("type your degreed number:");
      degrees = Double.parseDouble(typeDegrees);
      
      radian = (degrees * Pi/180);
      
      
     
         
      System.out.println(degrees + "degrees converts to " + radian); 
    }
}
