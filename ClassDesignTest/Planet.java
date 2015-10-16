public class Planet
{
    private int maxSpaceMarinesPerStarDestroyer;
    private double percentSpaceMarines, counter;
    private int maxPopulation;
    private String Name, Relationship; // Relationship, Name, percentSpaceMarines
    
    public Planet()
    {
       
        counter = Math.random();
        
        if( counter < 0.5)
            {
                Name = "Alpha";
            }       
        else if( counter < 0.90)
            {
                Name = "Beta";
            }       
        else if( counter < 1)
            {
                Name = "Gamma";
            }     
            
     
        maxSpaceMarinesPerStarDestroyer =1;
        percentSpaceMarines =1.00;
        
        
    }
    
public String toString()
    {
        String result = String.format(
                                        "Name: %s   %d\n"+
                                        "Radius: %.2f\n"+   
                                        "Population: %d\n"+
                                        "Space Marines as percent of Pop: %.2f\n"+
                                        "Space Marines: %d\n"+
                                        "Star Destoryer: %d\n"+
                                          "Space Marines per star destoryer: %.2f\n", Name, maxPopulation, percentSpaceMarines,
                                          maxPopulation,
                                          percentSpaceMarines, maxPopulation,
                                          maxPopulation,percentSpaceMarines);
                                        
                                        
                                       
        return result;
    }
}
