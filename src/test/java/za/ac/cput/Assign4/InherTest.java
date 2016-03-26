package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.Inher.Parts;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class InherTest {
    private static Parts part;
    public InherTest() {
    }
    @Test
    public void inheritanceTest() {
        part.setPartName("Mouse");
        Assert.assertEquals("Mouse", part.getPartName());
      }

    @BeforeClass
    public static void setUpClass() throws Exception {

        part = new Parts ("Mouse");
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
