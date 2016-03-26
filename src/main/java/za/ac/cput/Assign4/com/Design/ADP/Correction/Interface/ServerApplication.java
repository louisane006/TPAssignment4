package za.ac.cput.Assign4.com.Design.ADP.Correction.Interface;

/**
 * Created by louisane Malu on 3/26/2016.
 */
public interface ServerApplication {

    ServerApplication ser = new ServerApplication() {

        @Override
        public void payment(ServerApplication ser, String username, double amount) {

        }

        @Override
        public String getEmployeeNumber(String accountNumber) {
            return null;
        }
    };

    void payment(ServerApplication ser, String username, double amount);

    String getEmployeeNumber(String accountNumber);

}
