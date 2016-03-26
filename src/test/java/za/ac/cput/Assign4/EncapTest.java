package za.ac.cput.Assign4;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.Encap.Customer;

/**
 * Created by louisane Malu on 3/25/2016.
 */
public class EncapTest
{
    private static Customer cust;
    public EncapTest() {
    }
    @Test
    public void encapTest() {
        Assert.assertEquals("Louise", cust.getName());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        cust = new Customer();
        cust.setName("Louise");
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
