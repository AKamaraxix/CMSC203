class Coffee extends Beverage

{
	private boolean anExtraShot;
	private boolean anExtraSyrup;
	private final double COST_OF_SHOT = .5;
	private final double COST_OF_SYRUP = .5;


	public Coffee(String nString, SIZE sSize, boolean addTheShot, boolean addTheSyrup) 

	{
		super(nString, TYPE.COFFEE, sSize);
		anExtraShot = addTheShot;
		anExtraSyrup = addTheSyrup;
	
	}


public String toString() 
	{
      String theString = getBevName() +", " +getSize();

      if (anExtraShot) 
      {
    	  theString += " Extra shot";
      }
      if (anExtraSyrup) 
      {
    	  theString += " Extra syrup";
      }

      theString += ", $" +calcPrice();

      return theString;
	}
public double calcPrice() 

	{

		double thePrice;
		thePrice = super.getBasePrice();

		if (super.getSize() == SIZE.MEDIUM)
		
		{
			thePrice += super.getSizePrice();
		}

		else if (super.getSize() == SIZE.LARGE) 
		
		{
			thePrice += 2 * super.getSizePrice();
		}

		if (anExtraShot)
		
		{
			thePrice += COST_OF_SHOT;
		}
		
		if (anExtraSyrup) 
		
		{

			thePrice += COST_OF_SYRUP;
		}

		return thePrice;
	}

public boolean equals(Coffee C)

{
	if (super.equals(C) && anExtraShot==C.getExtraShot() && anExtraSyrup==C.getExtraSyrup())
	{
		return true;
	}
	else 
	
	{
		return false;
	}
}


	public boolean getExtraShot() 
	{
		return anExtraShot;
	}
	
	public boolean getExtraSyrup() 
	{
		return anExtraSyrup;
	}
	
	public double getShotCost() 
	{
		return COST_OF_SHOT;
	}
	
	public double getSyrupCost() 
	{
		return COST_OF_SYRUP;
	}

	public void setExtraShot(boolean shot)
	{
		anExtraShot = shot;
	}
	public void setExtraSyrup(boolean syrup) 
	{
		anExtraSyrup = syrup;
}
}
