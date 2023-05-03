

public class HolidayBonus {

 

  public static double[] calculateHolidayBonus(double[][] data, double high, double low,

      double other) {

    double[] bonus = new double[data.length];

   

 
    

    int maximumCol = 0;

    for (int index = 0;
    		 index < data.length;
    		 index++) 
    
    		{

    			if (maximumCol < data[index].length) 
    			
    			{

    				maximumCol = data[index].length;

    			}

    		}

   

    for (int secondIndex = 0;
    		 secondIndex < maximumCol;
    		 secondIndex++) 
         
    
    	{
    		int highestBonusIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, secondIndex);
    		int lowestBonusIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, secondIndex);

     


      if (TwoDimRaggedArrayUtility.getHighestInColumn(data, secondIndex) > 0) 
      
      	{ 

    	  bonus[highestBonusIndex] += high;

      	}

     

      

      if (TwoDimRaggedArrayUtility.getLowestInColumn(data, secondIndex) > 0 && highestBonusIndex!=lowestBonusIndex ) 
      
      {

    	  bonus[lowestBonusIndex] += low;

      }

     



      for (int index = 0;
    		   index < data.length;
    		   index++) 
      
      	{

        if (secondIndex >= data[index].length || index==highestBonusIndex || index==lowestBonusIndex || data[index][secondIndex] <= 0)
        
        {

          continue;

        } 
        
           else 
        	
        {

          bonus[index] += other;

        }

        System.out.println();

      }

    }  

    return bonus;

  }

 


  public static double calculateTotalHolidayBonus(double[][] data, double high, double low,

      double other) 
  
  {

   

    double[] arrayBounus = calculateHolidayBonus(data, high, low, other);

    double theTotal;
    theTotal = 0;

   

    for (double bonus:arrayBounus) 
    {

      theTotal+=bonus;

    }

    return theTotal;

  }

}