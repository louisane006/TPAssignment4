package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.DIP.Violation.Tester;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class DIPViolationTest {
    private static Tester test;
    public DIPViolationTest() {
    }

    @Test
    public void dipViolation() {
        Assert.assertEquals(test.salary() , "Getting 5000.00");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        test = new Tester("Getting 5000.00");
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
