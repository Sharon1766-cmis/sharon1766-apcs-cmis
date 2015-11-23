import javax.swing.JOptionPane;
public class MySong
{
    //1. Create instance variables
    private String Name;
    private String Group;
    private double Length;
    private int yearReleased;
    String mins = "";
    String user = JOptionPane.showInputDialog( "Username?");
    int pass = Integer.parseInt(JOptionPane.showInputDialog( "Password?"));
    
    //2. Write constructor to initialize instance variables
    public MySong()
    {
        Name = new String ("4 Walls");
        Group = new String ("F(x).");
        Length = 5.45;
        yearReleased = 2002;
    }//end contructor 
    
     public MySong(String Name, String Group, double Length)
    {
        this.Name = Name;
        this.Group = Group;
        this.Length = Length;
    }
    
    public int getyearReleased()
    {
        return yearReleased;
    }//end method getyearReleased

    public void setyearReleased(int year)
    {
        if (user.equals("Wong") && pass == (222))
        {
            this.yearReleased=year;
        }
    }//end method setyearReleased
    
     public String convertToSecond()
    {
        mins = (int)(Length/60) + "." + (int)(Length%60);
        return mins;
    }

    public String toString()
    {
        String output = new String();
        output = "The song is called " + Name + "\n" +
        "The Group is " + Group + "\n" +
        "The song length is " + Length + " mins.";
        return output;
    }//end method toString()
}