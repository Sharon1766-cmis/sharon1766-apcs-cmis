
public class Clock
{
 
   private int Hour;
   private int Mins;
   private int Secs;
   
public Clock()
    {
        Hour = 3;
        Mins = 45;
        Secs = 55;
    }    
public Clock (int Hour, int Mins, int Secs)    
    {
       this.Hour = Hour;
       this.Mins = Mins;
       this.Secs = Secs;
    }   
public String toString()
    {
        String output = new String ();
        output = Hour+ " : " + Mins + " : " +Secs +"\n";
        return output;
    } 
    
}
