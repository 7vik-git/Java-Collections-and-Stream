package annotations.custom;
public class TaskManager {
    @TaskInfo(priority = "high", assignedTo = "jon")
    public void completePaymentModule() {
        System.out.println("Completing payment module...");
    }

    @TaskInfo(priority = "very low", assignedTo = "snow")
    public void writeDocumentation() {
        System.out.println("Writing documentation...");
    }
}
