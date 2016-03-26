package za.ac.cput.Assign4.com.Design.PLK.Violation;

/**
 * Created by louisane Malu on 3/24/2016.
 */
public class Programmer extends Salary {
    private double amount;
    private double bonus;
    public Programmer(){}
    public Programmer (double amount, double bonus)
    {
        this.amount = amount;
        this.bonus = bonus;
    }
    public double getAmount()
    {
        return amount;
    }
    public void setAmount(double amount)
    {
        this.amount = amount;
    }
    public double getBonus()
    {
        return bonus;
    }
    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public Programmer getProgrammer(Programmer prog) {
        return super.getProgrammer(prog);
    }

    @Override
    public double total()
    {
        return bonus * amount;
    }

}
