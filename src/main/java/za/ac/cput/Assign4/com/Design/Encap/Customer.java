package za.ac.cput.Assign4.com.Design.Encap;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class Customer {
    private int Number;
    private String name;
    private String surname;
    private String address;

    public void setCustomerNumber(int Number){
        this.Number = Number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getCustomerNumber(){
        return Number;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getAddress(){
        return address;
    }
}
