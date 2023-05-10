class Alcohol extends Beverage
{
	private final double weekendSurCharge = .6;
	private boolean duringTheWeekend;
	


	public Alcohol(String i, SIZE size, boolean dTW)
	{
		super(i, TYPE.ALCOHOL, size);
		duringTheWeekend = dTW;
    }

	public String toString() 
	{
           String newString = getBevName() +", " +getSize();

            if (duringTheWeekend)
         {
          newString += " Weekend";
         }

           newString += ", $" +calcPrice();
           return newString;
    }
	
	public boolean equals(Alcohol aCo) 
    
	{
		if (super.equals(aCo) && duringTheWeekend == aCo.getIsWeekend()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public double calcPrice() 
	
	{
		double theCost = super.getBasePrice();
		
		if (super.getSize() == SIZE.MEDIUM) 
			{
				theCost += super.getSizePrice();
			}
				else if (super.getSize() == SIZE.LARGE) 
			{
				theCost += 2 * super.getSizePrice();
			}

         if (duringTheWeekend) 
         
         {
        	 theCost += weekendSurCharge;
         }

         	return theCost;
		  }

  public boolean getIsWeekend() 
  	
  	{
	  return duringTheWeekend;
  	}

  public double getWeekendFee() 
  	
  	{
	  return weekendSurCharge;
  	}


public void setIsWeekend(boolean correct) 
	{
		duringTheWeekend = correct;
	}
}
