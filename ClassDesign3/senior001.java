
public class senior001
{
 
   private double GPA; 
   private int age;
   private String fname;
   private String lname;
   
public senior001()
    {
        GPA = 3.99;
        fname = new String("Jim");
        lname = new String("Souza");
        age = 18;
    }    
public senior001 (double GPA, String fname, String lname, int age)    
    {
       this.GPA = GPA;
       this.fname = fname;
       this.lname = lname;
       this.age = age;
    }   
public String toString()
    {
        String output = new String ();
        output = "GPA:"+GPA +"\n"+
                        "First Name:" +fname+"\n" + 
                        "Last Name:" +lname + "\n" +
                        "Age:"+age;
        return output;
    } 
    
}
