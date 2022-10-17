package dataAcces.courses;

import entities.Courses;

import java.util.List;

public interface CourseDao {
    void save(Courses course);

    List<Courses> getList();
}
