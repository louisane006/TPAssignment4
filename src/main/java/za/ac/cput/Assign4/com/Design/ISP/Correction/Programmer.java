package za.ac.cput.Assign4.com.Design.ISP.Correction;

/**
 * Created by louisane Malu on 3/22/2016.
 */
public class Programmer implements Queries, Software {

    @Override
    public void respondToQueries()
    {
        System.out.println("Handle Queries");
    }
    @Override
    public void performCoding()
    {
        System.out.println("Handle Software");
    }
}
