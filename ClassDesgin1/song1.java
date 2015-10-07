
public class song1
{
 
   private double length;
   private String name;
   private String artist;
   
public song1()
    {
        length = 3;
        name = new String("If You DO");
        artist = new String("GOT7");
    }    
public song1 (double length, String name, String artist)    
    {
       this.length = length;
       this.name = name;
       this.artist = artist;
    }   
public String toString()
    {
        String output = new String ();
        output = "Legnth:"+length+"mins" +"\n"+
                        "Name:" +name+"\n" + 
                        "Artist:" +artist;
        return output;
    } 
    
}
