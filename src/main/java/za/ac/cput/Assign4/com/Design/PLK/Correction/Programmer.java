package za.ac.cput.Assign4.com.Design.PLK.Correction;

/**
 * Created by louisane Malu on 3/24/2016.
 */
public class Programmer{

    private int amount;
    private int bonus;

    public Programmer(){}
    public Programmer(int amount, int bonus)
    {
        this.amount = amount;
        this.bonus = bonus;
    }
    public void setAmount (int amount)
    {
        this.amount = amount;
    }
    public int getBonus(Programmer prog)
    {
        return prog.bonus;
    }
    public void setBonus (Programmer prog, int bonus)
    {
        prog.bonus = bonus;
    }
    public int getAmount()
    {
        return amount;
    }
    public int total (Programmer prog) {
        return prog.amount + prog.bonus;
    }
}
