package business;

import dataAcces.courses.CourseDao;
import entities.Courses;
import logging.Logger;
import java.util.List;

public class CourseManager{
    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        super();
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void save(Courses course) throws Exception {

        if (course.getCoursePrice() <= 0) {
            System.out.println("Kurs fiyatı sifirdan buyuk olmalidir!!!");
            //throw new Exception("Kurs fiyatı sifirdan buyuk olmalidir!!!");
            return;
        }

        List<Courses> coursesList =courseDao.getList();
        for (Courses courses: coursesList) {
            if(courses.getCourseName().equals(course.getCourseName())){
                System.out.println("Kurs ismi farkli olmalidir!!!");
                //throw new Exception("Kurs ismi farkli olmalidir!!!");
                return;
            }
        }


        System.out.println(course.getCourseName());
        courseDao.save(course);

        for (Logger logger : loggers) {
            logger.logMessage(course.getCourseName());
        }

    }
}
