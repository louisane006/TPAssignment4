package za.ac.cput.Assign4.com.Design.LSP.Violation;

/**
 * Created by louisane Malu on 3/22/2016.
 */
public class Tester {

    private int IdNumber;
    private String name;
    private String surname;

    public void setIdNumber(int IdNumber){this.IdNumber = IdNumber;}
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){this.surname = surname;}

    public int getIdNumber(){
        return IdNumber;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){return surname;}
}
