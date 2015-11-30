public class Student
{
    private String fname;
    private String lname;
    private double eng;
    private double math;
    private double sci;
    private double art;
    private double ss;
    private double[] grade = new double [5];

    
    public Student()
    {
       fname = "Jim";
       lname = "Souza";
    }
    
    public Student( String fname, String lname)
    {
        this.fname = fname;
        this.lname = lname;
      
    }
   
    public String toString()
    {
        String output =
        String.format(
                "First name: %s\n" +
                "Last name :  %s\n" +
                "AVG GPA : %.2f\n", 
                fname, lname,calcGPA());

        return output;
    }
    
    public Student(String fname, String lname, double eng, double math, double sci, double art, double ss)
    {
        this.fname=fname;
        this.lname=lname;
        grade[0] = eng;
        grade[1] = math;
        grade[2] = sci;
        grade[3] = art;
        grade[4] = ss;
    }

    public void setGPA(double eng, double math, double sci, double art, double ss)
    {
        this.grade[0] = eng;
        this.grade[1] = math;
        this.grade[2] = sci;
        this.grade[3] = art;
        this.grade[4] = ss;
    }

    public double calcGPA()
    {
        double GPA = 0.0;
        
        for (int i=0; i< grade.length; i++)
        {
            GPA = grade[i] + GPA;
        }
        
        GPA = GPA/grade.length;
        
        return GPA;

    }

}
