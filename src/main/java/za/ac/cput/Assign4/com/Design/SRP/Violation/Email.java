package za.ac.cput.Assign4.com.Design.SRP.Violation;

/**
 * Created by louisane Malu on 3/22/2016.
 */
public interface Email {
    void setSender(String sender);
    void setRecipient(String recipient);
    void setBody(String body);
    String getSender();
    String getRecipient();
    String getBody();
}
