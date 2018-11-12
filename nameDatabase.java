/*
*Create a database on female/male names for the 
*
*
*
*/
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class nameDatabase
{  
   
   //The main method is the object builder
   public static void main(String[] arg)
   {
      System.out.println("Choose a gender to bring up a list of names prior to the gender chosen");
      System.out.println("If the name is popular, it will show up, if not then it's not popular");
      
      //Makes an object
      nameDatabase kidsChoice = new nameDatabase();
      
      //retrieves gender analysis through object class
      kidsChoice.getGender();          
         
   }
   
   /**
    method header says it all
   */
   public static void getGender()
   {
      String genderType = JOptionPane.showInputDialog(null, "What is your child gender " +
                                                            "(male or female only)?:");
      String gender = genderType;
      
             
      if(gender.equals("male"))
      {
         System.out.println("pulling up the Male names database");
         loadGuyNames();
      }
         
      if(gender.equals("female"))
      {
         System.out.println("pulling up the Female names database"); 
         loadGirlNames();
      }
              
   }
   
   //verbal method to pull up female names
   
   /*
   *This method pulls up the girl names file and is supposed to read it and open it
   *afterwars it is to make the file an array. WHich will then test if a name 
   *inserted is important 
   */

   public String loadGirlNames throws IOException()
   {
      
      Scanner keyboard = new Scanner(System.in);
      
      File file1 = new File("GirlNames.txt");  
      if(!file1.exists())
      {
          System.out.println("The file GirlNames.txt is not found.");           
          System.exit(0); 
      }
      
      Scanner inputFile = new Scanner(file1); 
      
      inputFile.close(); 
      
      System.out.println("method check");   
   }
   
   /*
   *This method pulls up the guy names file and is supposed to read it and open it
   *afterwars it is to make the file an array. WHich will then test if a name 
   *inserted is important 
   */
   public String loadGuyNames throws IOException()
   {
      File file1 = new File("\\BoyNames.txt");  
      if(!file1.exists())
      {
          System.out.println("The file GuyNames.txt is not found.");           
          System.exit(0); 
      }
      
      Scanner inputFile = new Scanner(file1); 
      
      inputFile.close(); 
      System.out.println("method check");
   }
   
  }