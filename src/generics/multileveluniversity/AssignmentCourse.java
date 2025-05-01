package generics.multileveluniversity;
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title, int credits) {
        super(title, credits);
    }

    @Override
    public void evaluate() {
        System.out.println(title + ": Evaluation by assignments.");
    }
}
