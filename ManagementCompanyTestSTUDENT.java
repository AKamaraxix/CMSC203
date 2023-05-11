import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestSTUDENT 
{
	Property pro1 ,pro2,pro3,pro4,pro5,pro6;
	ManagementCompany mC ; 
	
	@Before
	public void setUp() throws Exception 
	{
		pro1 = new Property ("Washington", "Asherahland", 2000.00, "Cori Cakes",2,1,2,2);
		pro2 = new Property ("Kentland", "MusaLand", 4000, "Musa Kim",4,1,2,2);
		pro3 = new Property ("O Block", "Chicago", 6000, "Chief Keef",6,1,2,2);
		
		mC= new ManagementCompany("Young Turks", "555555555",6);
	 
		mC.addProperty(pro1);
		mC.addProperty(pro2);
		mC.addProperty(pro3);
	}

	@After
	public void tearDown() throws Exception 
	{
		pro1=pro2=pro3=pro4=pro5=pro6=null;
		mC=null;
	}
			
	@Test
	public void testGetMAX_PROPERTY()
	{
		assertEquals(mC.getMAX_PROPERTY(),5);
	}

	@Test
	public void testAddProperty() 
	{
		pro4 = new Property ("Virginia Beach", "HoePoint", 8000, "Christian Ayla",2,5,2,2);
		pro5 = new Property ("Grovee Cove", "Chicago", 5000, "Musa Banks",4,5,2,2);
		pro6 = new Property ("Whole lot of choppers", "Kentlandz", 3000, "Musa Banks",6,5,2,2);
		 
		assertEquals(mC.addProperty(pro4),3,0);
		assertEquals(mC.addProperty(pro5),4,0);
		assertEquals(mC.addProperty(pro6),-1,0);  //exceeds the size of the array and can not be added, add property should return -1	
	}

	@Test
	public void testTotalRent() {
		assertEquals(mC.totalRent(),12000.0,0);
	}

	 
	@Test
	public void testMaxRentProperty() {
		assertEquals(mC.maxRentProp(),6000.0,0);
	}
	


}
 