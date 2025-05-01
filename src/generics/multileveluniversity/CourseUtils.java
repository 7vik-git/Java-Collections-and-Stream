package generics.multileveluniversity;
import java.util.List;
public class CourseUtils {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
            course.evaluate();
        }
    }
}
