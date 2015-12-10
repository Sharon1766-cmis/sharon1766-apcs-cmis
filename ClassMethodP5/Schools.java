public class Schools
{
    public static void main(String[] args)
    {
        String school1 = new String ( "Oxford"); 
        String school2 = new String ( "Cambridge" ); 
        String school3 = new String ( "Harvard" ); 

        
        System.out.println(school1.compareTo(school2));
        System.out.println(school2.compareTo(school3));
        System.out.println(school3.compareTo(school1));
        System.out.println(school3.compareTo(school2));
        System.out.println(school2.compareTo(school1));
    }//end method main
    
}
//a. What is the output of the compareTo() method telling us? 
//It gives us an integer telling us how many letters does the first letter of String B has compared to String A

//b. Compare to schools that have the same first letter and a different second letter. What does compareTo() do in this case?
//In this case compareTo() will ignore the same first letter and move on to the second letters that are different and compares it.  