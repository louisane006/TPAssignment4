package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.LSP.Correction.Developer;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class LSPCorrectionTest {

    private static Developer dev;

    @Test
    public void lspCorrection() {
        dev.setIdNumber(213015889);
        Assert.assertEquals(213015889, dev.getIdNumber());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        dev = new Developer();
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
