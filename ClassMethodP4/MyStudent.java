public class MyStudent 
{
    //instances 
    private String fname;
    private String lname;
    private double[] grades = new double[5];
    private double eng;
    private double math;
    private double sci;
    private double art;
    private double ss;
    private String GPA;

 
    public MyStudent()
    {
        fname = new String("John");
        lname = new String("Doe");
 
        grades =new double[5];
        grades[0]=4.0;
        grades[1]=4.0;
        grades[2]=4.0;
        grades[3]=4.0;
        grades[4]=4.0;
    }

    
    public MyStudent(String fname, String lname,double eng, double math, double sci, double art, double ss,String GPA)
    {
        this.fname=new String(fname);
        this.lname=new String(lname);
        this.grades = new double[5]; 
        this.grades[0] = eng;
        this.grades[1] = math;
        this.grades[2] = sci;
        this.grades[3] = art;
        this.grades[4] = ss;
  
    }

    public double CalcGPA()
    {
        double total = 0.0;
        for(int index=0; index<grades.length;index++)
        {
            
            total +=grades[index];
        }
        total/= grades.length;

        return total; 

    }
    
    public void setGPA(double English, double Math, double Science, double FineArts, double SocialScience)
    {
        this.grades[0]=English;
        this.grades[1]=Math;
        this.grades[2]=Science;
        this.grades[3]=FineArts;
        this.grades[4]=SocialScience;
    }

    public String GPAletter()
    {
        if(CalcGPA()>=4.0)
        {
            GPA="A";
        }
        else if(CalcGPA()>= 3.0 && CalcGPA() < 4.0)
        {
            GPA="B";
        }
        else if(CalcGPA()>=2.0 && CalcGPA() < 3.0)
        {
            GPA="C";
        }
        else if(CalcGPA()>=1.0 && CalcGPA()< 2.0)
        {
            GPA="D";
        }
        else
        {
            GPA="F";
        }

        return GPA;
    }
    public String toString()
    {
        String result = String.format(
        "First Name: %s\n"+
        "Last Name: %s\n"+
        "AVG GPA : %s\n"+
        "%s's Grade: %s\n"+
        "%.2f" + 
        " %.2f" +
        " %.2f"+ 
        " %.2f" +
        " %.2f\n", fname, lname, CalcGPA(), fname, GPA, grades[0], grades[1], grades[2], grades[3],grades[4]);
        return result;
    }
    
}