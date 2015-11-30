public class StudentDriver
{
    public static void main (String[] arg)
    {
        Student senior = new Student();
        Student junior = new Student("joe", "senior", 4.0, 4.0, 3.5, 4.0, 4.0);
        
        System.out.println(senior);
        junior.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
        junior.calcGPA();
        System.out.println(junior);
        
    }
}