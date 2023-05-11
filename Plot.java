public class Plot

{

            private int x;
            private int y;
            private int depth;
            private int width;

           

            public Plot() {

                        x = 0;
                        y = 0;
                        width = 1;
                        depth = 1;

            }

           

            public Plot(Plot plot) 
            {

                        x = plot.getX();

                        y = plot.getY();

                        width = plot.getWidth();

                        depth = plot.getDepth();

            }

           

            public Plot(int xP, int yP, int pWidth, int pDepth)
            {

                        x = xP;

                        y = yP;

                        depth = pDepth;

                        width = pWidth;

            }

           

            public boolean overlaps(Plot plot)
            {

                        int secondx;
                            secondx= plot.getX();

                        int secondY;
                        secondY= plot.getY();

                        int depth2 = plot.getDepth();

                        int width2 = plot.getWidth();

                        boolean olap;
                        olap= false;

                       

                        if((x < secondx) && (secondx < (x+width))) {

                                    if(((y < secondY) && (secondY < (y+depth))) ||
                                    ( (y < (secondY+depth2)) && ((secondY+depth2) < (y+depth)))) 
                                    
                                    	{

                                                olap = true;

                                    	}

                        }

                        if((x < (secondx+width2)) && ((secondx+width2) < (x+width))) 
                        {

                                    if(((y < secondY) && (secondY < (y+depth))) || 
                                    ( (y < (secondY+depth2)) && ((secondY+depth2) < (y+depth)))) 
                                    
                                    {

                                                olap = true;

                                    }

                        }

                       

                        if((secondx < x) && (x < (secondx+width2))) {

                                    if(((secondY < y) && (y < (secondY+depth2))) || 
                                    ( (secondY < (y+depth)) && ((y+depth) < (secondY+depth2)))) 
                                    {

                                                olap = true;

                                    }

                        }

                        if((secondx < (x+width)) && ((x+width) < (secondx+width2)))
                        
                        {

                                    if(((secondY < y) && (y < (secondY+depth2))) || ( (secondY < (y+depth)) && ((y+depth) < (secondY+depth2)))) {

                                                olap = true;

                                    }

                        }

                       

                        if(encompasses(plot))
                        {

                                    olap = true;

                        }

                       

                        return olap;

            }

           

            public boolean encompasses(Plot plot)
            
            {

                        int secondX = plot.getX();

                        int secondY = plot.getY();

                        int d2 = plot.getDepth();

                        int w2 = plot.getWidth();

                       

                        if((x <= secondX) && (secondX <= (x+width))) 
                        {

                                    if((y <= secondY) && (secondY <= (y+depth))) 
                                    {

                                                if((x <= (secondX+w2)) && ((secondX+w2) <= (x+width))) 
                                                {

                                                            if((y <= (secondY+d2)) && ((secondY+d2) <= (y+depth))) 
                                                            {

                                                                        return true;

                                                            }

                                                }

                                    }

                                   

                        }

                       

                        return false;

            }

           

            public void setX(int xP) 
            {

                        x = xP;

            }

           

            public int getX() 
            {

                        return x;

            }

           

            public void setY(int yP) 
            {

                        y = yP;

            }

           

            public int getY() 
            {

                        return y;

            }

           

            public void setWidth(int pWidth) 
            {

                        width = pWidth;

            }

           

            public int getWidth() 
            {

                        return width;

            }

           

            public void setDepth(int pDepth) 
            {

                        depth = pDepth;

            }

           

            public int getDepth()
            {

                        return depth;

            }

           

            public String toString() 
            {

                        String output;

                        output = "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;

                        return output;

            }

}

