import business.CategoryManager;
import business.EducatorManager;
import dataAcces.categories.HibernateCategoryDao;
import dataAcces.categories.JDBCCategoryDao;
import dataAcces.courses.HibernateCourseDao;
import business.CourseManager;
import dataAcces.courses.JDBCCourseDao;
import dataAcces.educators.HibernateEducatorDao;
import dataAcces.educators.JDBCEducatorDao;
import entities.Categories;
import entities.Courses;
import entities.Educators;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        Courses course1 = new Courses(3, "python", 10);
        Courses course2 = new Courses(4,"Java", 20);
        Courses course3 = new Courses(4,"php", 0);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.save(course1);
        courseManager.save(course2);
        courseManager.save(course3);

        courseManager = new CourseManager(new JDBCCourseDao(),loggers);
        courseManager.save(course1);
        courseManager.save(course2);
        courseManager.save(course3);

        Categories categorie1 = new Categories("Database");
        Categories categorie2 = new Categories("Hardware");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
        categoryManager.save(categorie1);
        categoryManager.save(categorie2);

        categoryManager = new CategoryManager(new JDBCCategoryDao(),loggers);
        categoryManager.save(categorie1);
        categoryManager.save(categorie2);


        Educators educator1 = new Educators(1,"Aycan");
        Educators educator2 = new Educators(2,"Zehra");
        Educators educator3 = new Educators(3,"Şeyma");

        EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(),loggers);
        educatorManager.save(educator1);
        educatorManager.save(educator2);
        educatorManager.save(educator3);

        educatorManager = new EducatorManager(new JDBCEducatorDao(),loggers);
        educatorManager.save(educator1);
        educatorManager.save(educator2);
        educatorManager.save(educator3);


    }
}
