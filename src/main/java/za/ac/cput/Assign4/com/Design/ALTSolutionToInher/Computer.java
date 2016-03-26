package za.ac.cput.Assign4.com.Design.ALTSolutionToInher;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class Computer implements Parts{
    private String name;

    public Computer() {
    }

    public void setPartName(String name) {
        this.name = name;
    }
    public String getPartName() {
        return name;
    }

}
