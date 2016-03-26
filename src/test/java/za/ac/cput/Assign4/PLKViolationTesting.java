package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.PLK.Correction.Salary;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class PLKViolationTesting {
    private static Salary sal;

    @Test
    public void inheritanceTest() {
        sal.setAmount( 5000);
        Assert.assertEquals(5000, sal.getAmount());
    }
    @BeforeClass
    public static void setUpClass() throws Exception {

        sal = new Salary();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }
}
