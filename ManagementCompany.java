public class ManagementCompany {

            private String n;

            private String tID;

            private double mgmFees;

            private final int MAX_MUMBER_OF_PROPERTIES = 5;

            private Property[] p;

            private final int WIDTH = 10;

            private final int DEPTH = 10;

            private Plot pT;

            private int the_Count;

           

            public ManagementCompany() {

                        n = "";

                        tID = "";

                        mgmFees = 0;

                        pT = new Plot(0, 0, WIDTH, DEPTH);

                        p = new Property[MAX_MUMBER_OF_PROPERTIES];

                        the_Count = 0;

            }

           

            public ManagementCompany(String companyName, String id, double fee) {

                        n = companyName;

                        tID = id;

                        mgmFees = fee;

                        pT = new Plot(0, 0, WIDTH, DEPTH);

                        p = new Property[MAX_MUMBER_OF_PROPERTIES];

                        the_Count = 0;

            }

           

            public ManagementCompany(String companyName, String id, double fee, int x, int y, int width, int depth) {

                        n = companyName;

                        tID = id;

                        mgmFees = fee;

                        pT = new Plot(x, y, width, depth);

                        p = new Property[MAX_MUMBER_OF_PROPERTIES];

                        the_Count = 0;

            }

           

            public ManagementCompany(ManagementCompany company) {

                        n = company.n;

                        tID = company.tID;

                        mgmFees = company.mgmFees;

                        pT = company.pT;

                        p = company.p;

                        the_Count = company.the_Count;

            }

           

            public String toString() {

                        String message;

                       

                        message = "List of properties for " + n + ", taxID: " + tID;

                        message += "\n_____________________________________________\n";

                       

                        for(int index = 0; 
                        		index < the_Count; 
                        		index++) 
                        
                        		{

                                    message += p[index].toString();

                                    message += "\n";

                                  }

                       

                        message += "_____________________________________________\n";

                        double totalFee;
                        totalFee = (totalRent()*mgmFees)/100;

                       message += "Total Management Fee: " + totalFee;

                       

                        return message;

            }

           

            public int addProperty(Property property) 
            
            {

                        if(the_Count == MAX_MUMBER_OF_PROPERTIES) 
                        {

                                    return -1;

                        }

                       

                        if(property == null) 
                        {

                                    return -2;

                        }

                       

                        if(!pT.encompasses(property.getPlot())) 
                        {

                                    return -3;

                        }

                       

                        for(int index = 0; index < the_Count; index++) 
                        {

                                    if(property.getPlot().overlaps(p[index].getPlot()))
                                    {

                                                return -4;

                                    }

                        }

                       

                        Property pp;
                        pp= new Property(property);

                       

                        p[the_Count] = pp;

                        the_Count++;

                       

                        return the_Count-1;

                       

            }

           

            public int addProperty(String propertyName, String city, double rent, String ownerName) {

                        if(the_Count == MAX_MUMBER_OF_PROPERTIES) {

                                    return -1;

                        }

                       

                        Property pp;
                        pp= new Property(propertyName, city, rent, ownerName);

                        p[the_Count] = pp;

                        the_Count++;

                       

                        return the_Count-1;

            }

           

            public int addProperty(String propertyName, String city, double rent, String ownerName, int x, int y, int width, int depth) {

                        if(the_Count == MAX_MUMBER_OF_PROPERTIES) 
                        {

                                    return -1;

                        }

                       

                        Property pp;
                        pp= new Property(propertyName, city, rent, ownerName, x, y, width, depth);

                       

                        if(!pT.encompasses(pp.getPlot())) 
                        {

                                    return -3;

                        }

                       

                        for(int index = 0; index < the_Count; index++) 
                        
                        {

                                    if(p[index].getPlot().overlaps(pp.getPlot())) 
                                    {

                                                return -4;

                                    }

                        }

                       

                        p[the_Count] = pp;

                        the_Count++;

                       

                        return the_Count-1;

            }

           

            public String displayPropertyAtIndex(int index)
            {

                        return p[index].toString();

            }

           

            public int getMAX_PROPERTY()
            {

                        return MAX_MUMBER_OF_PROPERTIES;

            }

           

            public double maxRentProp() 
            {

                        double theMax;
                               theMax = p[maxRentPropertyIndex()].getRentAmount();

                        return theMax;

            }

           

            public int maxRentPropertyIndex() 
            {

                        int mrpi= 0;

                        double max;
                        max = p[0].getRentAmount();

                       

                        for(int index = 1; 
                        		index < the_Count; 
                        		index++)
                        {

                                    if(p[index].getRentAmount() > max) 
                                    {

                                                max = p[index].getRentAmount();

                                                mrpi = index;

                                    }

                        }

                       

                        return mrpi;

            }

           

            public double totalRent() {

                        double t;
                        t= 0;

                       

                        for(int index = 0; index < the_Count; index++) {

                                    t += p[index].getRentAmount();

                        }

                       

                        return t;

            }

}
