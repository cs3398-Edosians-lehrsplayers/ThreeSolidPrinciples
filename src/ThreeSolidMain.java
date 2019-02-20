package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

// create classes and call methods.


public class ThreeSolidMain
{   

   public static Manager tsManager = new Manager();
   public static ProjectManager projMngr = new ProjectManager();
   public static ProductManager prodMngr = new ProductManager();

   // The entry main() method
   public static void main(String[] args) 
   {
      System.out.format("Let's get started ... \n"); 
      try 
      {  
         System.out.format("\nManagement hiring new TempWorker.. \n"); 
         tsManager.setWorker(new TempWorker());
         System.out.format("Managing TempWorker.. \n"); 
         tsManager.manage();

         System.out.format("\nProduct Management hiring new SuperWorker.. \n"); 
         prodMngr.setWorker(new SuperWorker());
         prodMngr.defineProduct();
         System.out.format("Managing SuperWorker.. \n"); 
         prodMngr.manage();

         System.out.format("\nProject Management hiring new Robot.. \n");
         projMngr.setWorker(new Robot());
         projMngr.scheduleWork();
         System.out.format("Managing Robot.. \n");
         projMngr.manage();
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.out.format("\nAll done! \n"); 
      System.exit(0);

   }
 }
