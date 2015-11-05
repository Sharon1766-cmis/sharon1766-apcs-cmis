
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
        String result =  String.format (
        "Length:  %.0f mins\n"+
        "Name:  %s\n"+
        "Artist:  %s\n", length, name, artist);
        return result;
    } 
    
}
