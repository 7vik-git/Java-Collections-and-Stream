package annotations.repeatable;
public class IssueTracker {
    @BugReport(description = "NullPointerException on login", reportedBy = "Sathvik", severity = "High")
    @BugReport(description = "UI not responsive on mobile", reportedBy = "John Wick", severity = "Very High")
    public void loginFeature() {
        System.out.println("Executing login feature...");
    }
}
