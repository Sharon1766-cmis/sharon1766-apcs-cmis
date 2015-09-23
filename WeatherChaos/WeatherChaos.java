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
       
 
        
        for ( int i = 0; i < Inputdays; i++ )
        {
            Temp = (int) (Math.random() * 200) - 100 ;
            day = i +1 ;
            swing = PreTemp-Temp;
            des = " ";
            
   
              if (Temp < 0)  
              {
                  des = "freezing";
                  
              }
              
              if (Temp >0 && Temp<15) ;
              {
                  des =  "CHilly" ;
                    
              }
              
               if (Temp > 15 && Temp<30) ;
              {
                  des =  "comfortable" ;
                    
              }
              
               if (Temp > 31 && Temp<40) ;
              {
                  des =  "hot" ;
            
              }
              
                if (Temp >= 40)  
              {
                  des =  "AAAHHHHHH" ;
                   
              }
            
              System.out.println(day + "   "+ Temp + "   " + "   "+swing + "   " +des);
           
        
        }   
       
    }
}
