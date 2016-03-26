package za.ac.cput.Assign4.com.Design.SRP.Violation;

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
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
   public String getSender() {
       return sender;
   }

    @Override
   public String getRecipient() {
       return recipient;
   }

    @Override
   public String getBody() {
           return body;
       }

}
