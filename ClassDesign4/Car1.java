
public class Car1
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
        String result =  String.format (
        "Name: %s\n"+
        "Seating: %d", Name, Seating);
             
        return result;
    }   
    
}
