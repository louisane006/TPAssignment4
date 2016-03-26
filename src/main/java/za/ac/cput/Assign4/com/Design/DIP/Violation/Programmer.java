package za.ac.cput.Assign4.com.Design.DIP.Violation;


/**
 * Created by louisane Malu on 3/21/2016.
 */
public class Programmer {
    Tester test;

    public Programmer(String salary) {

    }

    public String salary(){
        return test.salary();
    }
}
