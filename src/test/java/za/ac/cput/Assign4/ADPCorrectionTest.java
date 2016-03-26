package za.ac.cput.Assign4;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ac.cput.Assign4.com.Design.ADP.Violation.Employee.EmployeeClass;

/**
 * Created by louisane Malu on 3/26/2016.
 */
public class ADPCorrectionTest {
    private static EmployeeClass emp;

    public ADPCorrectionTest() {
    }

    @Test
    public void dipCorrection() {
        Assert.assertEquals("213015889",emp.getEmployeeNumber());

    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        emp = new EmployeeClass();
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
