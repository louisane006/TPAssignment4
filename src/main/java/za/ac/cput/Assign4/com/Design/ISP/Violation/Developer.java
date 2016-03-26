package za.ac.cput.Assign4.com.Design.ISP.Violation;

/**
 * Created by louisane Malu on 3/22/2016.
 */
public class Developer implements Tasks {
    public void coding()
    {
        System.out.println("Coding");
    }
   public  void respondToQueries()
   {
       System.out.println("Handle Queries");
   }
    public void performCoding()
    {
        System.out.println("Handle Software");
    }
}
