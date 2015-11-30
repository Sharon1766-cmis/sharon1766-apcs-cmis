import javax.swing.JOptionPane;
public class Song 
{
    private String artist;
    private String name;
    
    
    private String min;
    private int seconds;
    private int length;
    private int year;
    
    String user = JOptionPane.showInputDialog("What's the username?? ");
    String pass = JOptionPane.showInputDialog("What's the Password? ");
    
    public Song()
    {
        artist = "EXO";
        name = "Call Me baby";
        length = 500;
    }

    public int getYearReleased()
    {
        return year;
    }

    public void setYearReleased(int year)
    {
        if( user.equals("Sharon") && pass.equals("123"))
        {
            this.year = year;
        }
    }

    public String convert()
    {
        min = (Integer.toString(length/60)) + " minutes " + (Integer.toString(length%60)) + " seconds.";
        return min;
    }

    public String toString()
    {
        String result = String.format(
        "Artist: %s\n"+
        "Name: %s\n", artist, name);
        return result;
    }
}