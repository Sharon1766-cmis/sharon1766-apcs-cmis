
public class Card
{
 
   private int  Faces;
   private String Suit;
   
public Card()
    {
        Name = new String ("Ford Fiesta");
        Seating = 5;
       
    }    
public Card (String Name, int Seating )    
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
