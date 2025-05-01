package generics.multileveluniversity;
class ExamCourse extends CourseType {
    public ExamCourse(String title, int credits) {
        super(title, credits);
    }

    @Override
    public void evaluate() {
        System.out.println(title + ": Evaluation by final exam.");
    }
}




