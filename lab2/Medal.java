/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 24,September
 * Modified: 24,September
 * Description: this class prints a table showing medal winner counts with row totals.
 */


/** This class prints a table of medal winner counts with row totals.
 * @author Wenqi Tang
 * @version 1.1
 * @since Java 17.0.7
 *
 */
public class Medal
{
	/**
	 * The main class is use to printing a table to show the number of medals that each country won,as well as the total value.
	 * @param args an array of String arguments that can be passed to the program from the command line.
	 */
   public static void main(String[] args)
   {
	   /**
	    * the number of participated countries
	    */
      final int COUNTRIES = 8;
      /** 
       * different types of medals
       */
      final int MEDALS = 3;
      
      

      //crate an array to place countries
      String[] countries =
         {
            "Canada",
            "Italy",
            "Germany",
            "Japan",
            "Kazakhstan",
            "Russia",
            "South Korea",
            "United States"
         };

      //create an array to place the number of medals
      int[][] counts =
         {
            { 0, 3, 0 },
            { 0, 0, 1 },
            { 0, 0, 1 },
            { 1, 0, 0 },
            { 0, 0, 1 },
            { 3, 1, 1 },
            { 0, 1, 0 },
            { 1, 0, 1 }
         };
      
      
      //print the title line
      System.out.println("        Country    Gold  Silver  Bronze   Total");
      
      // Use for loop to print countries, counts, and row totals
      for (int i = 0; i < COUNTRIES; i++)
      {
         // Process the ith row
    	  //TO DO: Use printf() to print country name as a field of 15 bytes as a String value:
         System.out.printf("%15s",countries[i]);
     
         

         //	The total value calculate the total number of each row
         int total = 0; 

         // Print each row element and update the row total
         for (int j = 0; j < MEDALS; j++)
         {
            System.out.printf("%8d", counts[i][j]);
            
            //To DO: calculate the total for each row
            total += counts[i][j];
          
         }
         
      

         // Display the row total and print a new line
         //To Do: use printf() to print  total for each row as a field of size 8 and numeric data type. Include newline after printing each value
         System.out.printf("%8d",total);
         System.out.println();
        
         
      }
      
     
      //print "total" to prepare to record the total number of medals' line
      System.out.printf("%15s","total");
      
      
      //Extra - To DO: define an array of size 3 to hold the total for each column. 
      //               Modify the above code to keep total for each medal type, and then use a for loop to print total line below
      int[] totalCol = new int[MEDALS];
      
    
      //keep the total number of each column
     for(int i = 0; i < COUNTRIES; i++) {
    	  for (int j = 0; j < MEDALS; j++) {
    		  totalCol[j] += counts[i][j];
    	  }
      }
      
      //use a for loop to print the total number of each type's  medals
      for (int total: totalCol) {
    	  System.out.printf("%8s",total);
      }
      
   }//end method main
}//end class Medal 