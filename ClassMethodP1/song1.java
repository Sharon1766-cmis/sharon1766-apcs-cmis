
public class song1
{
 
   private double length;
   private String name;
   private String artist;
   private int YearReleased;
   
public song1()
    {
        YearReleased = 2013;
        length = 3;
        name = new String("If You DO");
        artist = new String("GOT7");
    }    
public int getYearReleased()
    {
        return YearReleased;
    }    
public void setYearReleased(int Year)
    {
        this.YearReleased = Year;
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
        "Artist:  %s"+"\n\n", length, name, artist,);
        return result;
    } 
    
}
