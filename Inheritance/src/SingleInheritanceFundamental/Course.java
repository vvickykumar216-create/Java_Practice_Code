package SingleInheritanceFundamental;

public class Course {
    String courseName = "CoreJava";
}
class JavaCourse extends Course{
    void showDuration(){
        System.out.println("Course Name: "+ courseName );
        System.out.println("Duration: 6 Months");
    }

    static void main(String[] args) {
        JavaCourse jc = new JavaCourse();
        jc.showDuration();
    }
}
