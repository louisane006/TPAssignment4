package za.ac.cput.Assign4.com.Design.LSP.Violation;

/**
 * Created by louisane Malu on 3/22/2016.
 */
public class Developer extends Tester{

    public void setIdNumber(int IdNumber){
        throw new NullPointerException();
    }
    public void setName(String name){
        throw new NullPointerException();
    }
    public void setSurname(String surname) {throw new NullPointerException();}


}
