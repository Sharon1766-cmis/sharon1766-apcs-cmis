import javax.swing.JOptionPane;

public class WeatherChaos
{
public static void main ( String[] argv )
    {
        String nInputdays = JOptionPane.showInputDialog ("How Many Days?");
       
        
        int Inputdays = Integer.parseInt(nInputdays);
        
        int [] days = new int [Inputdays];
        int Temp;
        int PreTemp = 0;
        int day;
        int swing;
        String des;
        int min = 99;
        int max = 0;
        int MinDay = 0;
        int MaxDay = 0;
        int sum = 0;
        
        if ( Inputdays <= 0 && Inputdays >= 32)
            {
                  System.out.println("NOT A VALID DAY");
            }
      else 
            {
              
                System.out.println("day" + "   "+" Temp" + "   " + "swing  "+"   " +"des");
                
                for ( int i = 0; i < Inputdays; i++ )
                {
                    Temp = (int) (Math.random() * 200) - 100 ;
                    day = i +1 ;
                    swing = PreTemp-(-Temp);
                    des = " ";
                    
                    if ( Temp < min )
                    {
                        min = Temp;
                        MinDay = day;
                    }
                    
                    if ( Temp > max )
                    {
                        max = Temp;
                        MaxDay = day;
                    }
           
                      if (Temp < 0)  
                      {
                          des = "freezing";
                          
                      }
                      
                      if (0<Temp &&Temp<15) 
                      {
                          des =  "CHilly" ;
                            
                      }
                      
                       if ( 15 < Temp && Temp<30) 
                      {
                          des =  "comfortable" ;
                            
                      }
                      
                       if (31 < Temp && Temp<40) 
                      {
                          des =  "hot" ;
                    
                      }
                      
                        if (Temp >= 40)  
                      {
                          des =  "AAAHHHHHH" ;
                           
                      }
                    
                      System.out.println(day + "         "+ Temp + "       " + "      "+swing + "       " +des);
                      
                    sum +=Temp;
                
                }   
                    System.out.println("The minimum temperature was " + min + " on day " + MinDay + ".");
                    System.out.println("The maximum temperature was " + max +"on day" + MaxDay + ".");
                    System.out.println("The average temperature was "+ (double)sum/(double)Inputdays + ".");
                    System.out.println("BIGGEST SWING WAS .......I dont konw");
                    
            }
}
}
