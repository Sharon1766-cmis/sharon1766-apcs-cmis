public class MySongDriver
    {
    public static void main (String[] args)
        {
        MySong song1 = new MySong();
        MySong song2 = new MySong("MANSAE", "SEVENTEEN", 3.55);
       
        
        System.out.println(song1 + "\n" + "Song was realeased in " + song1.getyearReleased() + "." + "\n" + "\n" + song2);
        
        song1.setyearReleased(1998);
        System.out.println("Song was realeased in " + song1.getyearReleased() + "." );
        
        }
    }