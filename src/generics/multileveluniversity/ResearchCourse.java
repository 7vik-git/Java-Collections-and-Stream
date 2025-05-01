package generics.multileveluniversity;
class ResearchCourse extends CourseType {
    public ResearchCourse(String title, int credits) {
        super(title, credits);
    }

    @Override
    public void evaluate() {
        System.out.println(title + ": Evaluation by research paper.");
    }
}