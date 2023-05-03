import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

import java.util.Scanner;

 

 

public class TwoDimRaggedArrayUtility {

 

  public static double getAverage(double[][] data)
  
  	{
	  
	
	  int theElements;
	  double total;
	  
	  theElements=0;
	  total=0;

    for (int index = 0;
    		 index < data.length;
    		 index++) 
    
    {

      theElements += data[index].length;

      for (int secondIndex = 0;
    		   secondIndex < data[index].length;
    		   secondIndex++) 
      {

        total += data[index][secondIndex];

      }

    }

   

    return total / theElements;

  }

 


  public static double getColumnTotal(double[][] data, int col) {

    double columnTotal;
   
    columnTotal =0;

    for (int index = 0;
    	     index < data.length;
    		 index++) 
    
    {

      if (col >= data[index].length) 
      
      {

        continue;
       }

        columnTotal += data[index][col];

    }

    return columnTotal;

  }

 


  public static double getHighestInArray(double[][] data) 
  
  {

    double highest;
    highest= -999999;

    for (int index = 0;
    		 index < data.length;
    		 index++) 
        {

            for (int secondIndex = 0;
            		 secondIndex < data[index].length;
            		 secondIndex++) {

        if (data[index][secondIndex] > highest) 
        	{
        		highest = data[index][secondIndex];
        	}

      }

    }

    return highest;

  }

 



  public static double getHighestInColumn(double[][] data, int col) {

    double highest;
    highest = -999999;

    for (int index = 0;
    		 index < data.length;
    		 index++)
    {

      if (col >= data[index].length) {

        continue;

      }

      if (data[index][col] > highest) 
      {

        highest = data[index][col];

      }

    }

    return highest;

  }

 

  public static int getHighestInColumnIndex(double[][] data, int col) {

    double highest;
    highest = -999999;

    int total = -1;

    for (int index = 0;
    		 index < data.length;
    		 index++)
    
    {

      if (col >= data[index].length) {

        continue;

    }

      if (data[index][col] > highest ) {

        highest = data[index][col];

        total = index;

      }

    }

    return total;

  }

 


  public static double getHighestInRow(double[][] data, int row) {

    double highest;
    
    
    
    highest= -999999;

    for (int index = 0;
    		 index < data[row].length;
    		 index++) 
    
      {
         if (data[row][index] > highest) 
         
        {
        	 highest = data[row][index];
        }

    }

    return highest;

  }

 

 

  public static int getHighestInRowIndex(double[][] data, int row) 
  
  {

    double highest; 
    highest= -999999;

    int total;
        total= -1;

    for (int index = 0;index < data[row].length;index++) 
    
    {

      if (data[row][index] > highest) 
      {

        highest = data[row][index];
        total = index;

      }

    }

    return total;

  }

 


  public static double getLowestInArray(double[][] data) {

    double lowest;
    lowest= 999999;

    for (int index = 0;
    		 index < data.length;
    		 index++) 
    
    {

      for (int secondIndex = 0;
    		   secondIndex < data[index].length;
    		   secondIndex++) 
         {

        if (data[index][secondIndex] < lowest) 
           {

          lowest = data[index][secondIndex];

           }

        }

    }

    return lowest;

  }

 


  public static double getLowestInColumn(double[][] data, int col) {

    double lowest;
    lowest = 999999;

    for (int index = 0;
    		 index < data.length;
    		 index++) 
    {

      if (col >= data[index].length) 
      {

        continue;

      }

      if (data[index][col] < lowest) 
      {

        lowest = data[index][col];

      }

    }

    return lowest;

  }

 

  

  public static int getLowestInColumnIndex(double[][] data, int col) {

    double lowest;
    	   lowest =999999;

    int total; 
        total= -1;

    for (int index = 0;
    		 index < data.length;
    		 index++) 
    
    	{

      if (col >= data[index].length) 
      
      {

        continue;

      }

      if (data[index][col] < lowest ) 
      
      {

        lowest = data[index][col];
        total = index;

      }

    }

    return total;

  }

 


  public static double getLowestInRow(double[][] data, int row) {

    double lowest;
     lowest = 999999;

    for (int index = 0;
    		 index < data[row].length;
    		 index++)
    
    	{

    		if (data[row][index] < lowest)
    			
    		{

    			lowest = data[row][index];

    		}

    }

    return lowest;

  }

 


  public static int getLowestInRowIndex(double[][] data, int row) {

    double lowest;
    lowest = 999999;

    int total = -1;

    for (int index = 0;
    		 index < data[row].length;
    		 index++) {

      if (data[row][index] < lowest) 
      {
          lowest = data[row][index];
          total = index;

      }

    }

    return total;

  }

 



  public static double getRowTotal(double[][] data, int row) {

    double total;
           total= 0;

    for (int index = 0;
    		 index < data[row].length;
    		 index++) 
    {

        total += data[row][index];

    }

    return total;

  }

 


  public static double getTotal(double[][] data) {

    double total;
           total= 0;

    for (int index = 0;
    		 index < data.length;
    		 index++)
         {

      for (int secondIndex = 0;
    		   secondIndex < data[index].length;
    		   secondIndex++)
      {

        total += data[index][secondIndex];

      }

    }

   

    return total;

  }

 

 

  public static double[][] readFile(File file) throws FileNotFoundException  {

    Scanner theScanner = new Scanner(file);

    int theRow;
        theRow= 0;

    String[][] tempArray = new String[10][];

    


    while (theScanner.hasNextLine()) 
    {

    	String[] r = theScanner.nextLine().split(" ");

    	tempArray[theRow] = new String[r.length];

     for (int index = 0;
    		  index < r.length;
    		  index++)
     {

       tempArray[theRow][index]=r[index];  

     }

     theRow++;

    }

   

    double[][]data = new double[theRow][];

    for (int index = 0; 
    		 index < theRow;
    		 index++)
    {

      data[index]= new double[tempArray[index].length];

      for (int secondIndex = 0;
    		   secondIndex < tempArray[index].length;
    		   secondIndex++) 
      
      
      {

          System.out.print(tempArray[index][secondIndex] + " ");

          data[index][secondIndex] = Double.parseDouble(tempArray[index][secondIndex]);

      }

      System.out.println();

    }

   

    theScanner.close();

    return data;

  }

 


  public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {

    PrintWriter theOutPut = new PrintWriter(outputFile);

    StringBuilder build = new StringBuilder();

    for (int index = 0;
    		 index < data.length;
    		 index++) 
    
    	{

    		for (int secondIndex= 0;
    				 secondIndex < data[index].length;
    				 secondIndex++) 
    		
    {

        build.append(data[index][secondIndex]+ " ");

    }

      build.append("\n");

    }

    theOutPut.print(build.toString());

    theOutPut.close();

  }

 

}