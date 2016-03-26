package za.ac.cput.Assign4.com.Design.OCP.Violation;

/**
 * Created by louisane Malu on 3/22/2016.
 */
public class Agenda {
    public void performTask(Tasks task){
        if(task.taskId == 200)
        {
            coding();
        }
        else
        if(task.taskId == 100){
            makingAPp();
        }
    }
    public void makingAPp() {
    }
    public void coding(){
    }
}
