package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.SRP.Violation.TaskEmail;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class SRPViolationTest {
    private static TaskEmail t;
    public SRPViolationTest() {
    }
    @Test
    public void srpViolation() {
        t.setSender("louisane006@gmail.com");
        Assert.assertEquals("louisane006@gmail.com" , t.getSender());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        t = new TaskEmail();
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
