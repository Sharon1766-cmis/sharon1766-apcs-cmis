
public class Card
{
 
   private String  Name;
   private int Seating;
   
public Car1()
    {
        Name = new String ("Ford Fiesta");
        Seating = 5;
       
    }    
public Car1 (String Name, int Seating )    
    {
       this.Name = Name;
       this.Seating = Seating;
      
    }   
public String toString()
    {
        String output = new String ();
        output = "Name:"+Name +"\n"+
                        "Seating:" +Seating+"\n" ;
             
        return output;
    } 
    
}
