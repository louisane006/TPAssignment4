package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.ISP.Correction.Programmer;
import za.ac.cput.Assign4.com.Design.LSP.Correction.Developer;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class ISPViolationTest {
    private static Developer dev;
    private static Programmer p;
    public ISPViolationTest() {
    }
    @Test
    public void ispViolation() {
        Assert.assertSame(dev , p);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
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
