package architect;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by tranpham on 6/28/17.
 */
public class Student extends Person{

    String student_id;

    float  GPA;

    Date   expected_grad_date;

    ArrayList<Enrollment> enrollments;

    public boolean enroll(Course course){
        return  false;
    }

    public  boolean drop(Course course){
        return false;
    }

//    public ArrayList<Enrollment> listEnrollment(){
//        return null;
//    }
}
