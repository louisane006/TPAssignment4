package za.ac.cput.Assign4.com.Design.Poly;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class Parts {
    private String name;
    private String make;
    private String serial;

    public void setPartName(String name) {
        this.name = name;
    }
    public void setPartMake(String make) {
        this.make = make;
    }
    public void setPartSerial(String serial) {
        this.serial = serial;
    }


    public String getName() {
        return name;
    }
    public String getMake() {
        return make;
    }
    public String getSerial(){return serial;}
}
