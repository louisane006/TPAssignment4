package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.OCP.Correction.Codes;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class OCPCorrectionTest {
    private static Codes cod;
    public OCPCorrectionTest() {
    }
    @Test
    public void ocpCorrection() {
        Assert.assertEquals(cod.agenda() , "Codes Edition");
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
        cod = new Codes();
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
