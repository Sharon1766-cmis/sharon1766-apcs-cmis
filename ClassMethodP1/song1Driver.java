
public class song1Driver
{
 public static void main ( String[] args )
 
    {
        song1 SongNew=new song1();
        song1 OtherSong = new song1( 4.0, "EXO" , "Love Me RIght");
        
       
        System.out.println( SongNew+ "\n" + "Year:" +SongNew.getYearReleased() );
        OtherSong.setYearReleased( 2033 );
        System.out.println( OtherSong+ "\n" + "Year:" +SongNew.getYearReleased() );
        
        
    }
}
