package za.ac.cput.Assign4.com.Design.SRP.Correction;

/**
 * Created by louisane Malu on 3/22/2016.
 */
public class TaskEmail implements Email{
    private String sender;
    private String recipient;
    private String body;

    @Override
    public void setSender(String sender) {
        this.sender = sender;
    }
    @Override
    public void setRecipient(String recipient) {this.recipient = recipient;
    }
    @Override
    public void setBody(EmailContent con) { con.getBody();
    }

}
