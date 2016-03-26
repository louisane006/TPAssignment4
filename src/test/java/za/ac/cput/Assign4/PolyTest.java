package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.Poly.Parts;
import za.ac.cput.Assign4.com.Design.Poly.Server;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class PolyTest {
    private static Parts part;
    public PolyTest() {
    }

    @Test
    public void polymorphismTest() {
        Assert.assertEquals(part.getName(), "CPUT");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        part = new Server("CPUT");
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
