public class Clock
{
  
      //instance
    private int hours;
    private int min;
    private int secs;
    private int totalsecs;
    private int addhour;
    //constructor 
    public Clock()
    {
        hours = 18;
        min = 33;
        secs = 55;
    }
    
    //three-argument constructor
    public Clock(int hours,int min, int secs)
    {
        this.hours=hours;
        this.min=min;
        this.secs=min;
    }
    
    //set the time
    public void setTime(int hours,int min, int secs)
    {
        this.hours=hours;
        this.min=min;
        this.secs=min;
    }
    
    //convert time to secs
    public int totalsecs()
    {
        totalsecs=(hours*3600)+(min*60)+secs;
        return totalsecs;
    }
    
    //daylightsaving +1 hour
    public int convertDaylightSaving(int addhour)
    {
        this.hours=this.hours+addhour;
        return hours;
    }
    //turn into a string to print
    public String toString()
    
    {
        String result = String.format(
        "TIME: %d : %d : %d \n"+
        "Time in Secs: %d\n", hours, min, secs, totalsecs);
        return result;
    }
    
}// end clss Clock