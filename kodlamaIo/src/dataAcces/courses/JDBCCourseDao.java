package dataAcces.courses;

import entities.Courses;

import java.util.ArrayList;
import java.util.List;

public class JDBCCourseDao implements CourseDao {
    @Override
    public void save(Courses course) {
        System.out.println(course.getCourseName() +" kursu, JDBC ile veritabanına kaydedildi" );
    }

    @Override
    public List<Courses> getList() {
        List<Courses> courses= new ArrayList<>();
        courses.add(new Courses(1, "Java", 100));
        courses.add(new Courses(2, "C#", 110));
        return courses;
    }
}
