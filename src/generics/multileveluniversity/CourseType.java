package generics.multileveluniversity;

public abstract class CourseType {
    protected String title;
    protected int credits;

    public CourseType(String title, int credits) {
        this.title = title;
        this.credits = credits;
    }

    public abstract void evaluate();

    @Override
    public String toString() {
        return title + " (" + credits + " credits)";
    }
}
