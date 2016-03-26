package za.ac.cput.Assign4.com.Design.ISP.Correction;

/**
 * Created by louisane Malu on 3/22/2016.
 */
public interface Tasks extends Queries, Coding, Software{
    //void performTask();

    boolean performTask(boolean s);
}
