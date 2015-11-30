public class SongDriver1 
{
    public static void main (String argvs [] )
    {
        Song NewSong = new Song();
        
        System.out.println(NewSong); //Print the song info
        
        System.out.println("Length: " + NewSong.convert());//the left out time
        
        NewSong.setYearReleased(1998);
        
        System.out.println("Year Released: " + NewSong.getYearReleased());
    }
}