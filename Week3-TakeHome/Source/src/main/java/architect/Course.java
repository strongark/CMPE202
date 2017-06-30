package architect;

import java.util.ArrayList;

/**
 * Created by tranpham on 6/28/17.
 */
public class Course {

    String course_id;

    String course_name;

    float  fee;

    int    student_limit;

    ArrayList<Enrollment> enrollments;

    Lecturer lecturer;

    public boolean addStudent(Student student){
        return false;
    }
    public boolean dropStudent(Student student){
        return false;
    }

    public ArrayList<Student> listStudent(){
        return null;
    }
}
