package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.DIP.Correction.Programmer;
import za.ac.cput.Assign4.com.Design.DIP.Correction.Salary;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class DIPCorrectionTest {
    private static Salary salary;

    public DIPCorrectionTest() {
    }

    @Test
    public void dipCorrection() {
        Assert.assertEquals(salary.salary() , "Getting 5000.00 as Basic");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        salary = new Programmer();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

