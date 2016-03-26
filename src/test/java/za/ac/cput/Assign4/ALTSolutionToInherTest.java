package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.ALTSolutionToInher.Computer;
import za.ac.cput.Assign4.com.Design.ALTSolutionToInher.Parts;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class ALTSolutionToInherTest {

    private static Parts part;
    private static Computer comp;
    public ALTSolutionToInherTest() {
    }
    @Test
    public void inheritanceTest() {
        comp.setPartName("Mouse");
        Assert.assertEquals("Mouse", comp.getPartName());
    }
    @BeforeClass
    public static void setUpClass() throws Exception {

        comp = new Computer() ;
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
