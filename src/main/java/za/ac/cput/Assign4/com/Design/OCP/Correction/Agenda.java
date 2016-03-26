package za.ac.cput.Assign4.com.Design.OCP.Correction;

/**
 * Created by louisane Malu on 3/22/2016.
 */
public class Agenda {
    Codes code;
    Application app;

    public String performAgenda()
    {
        return app.agenda() + "and " + code.agenda();
    }
}
