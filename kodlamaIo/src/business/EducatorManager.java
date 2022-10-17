package business;

import dataAcces.courses.CourseDao;
import dataAcces.educators.EducatorDao;
import entities.Courses;
import entities.Educators;
import logging.Logger;

import java.util.List;

public class EducatorManager {
    private EducatorDao educatorDao;
    private List<Logger> loggers;

    public EducatorManager(EducatorDao educatorDao, List<Logger> loggers) {
        super();
        this.educatorDao = educatorDao;
        this.loggers = loggers;
    }

    public void save(Educators educator) throws Exception {

        System.out.println(educator.getEducatorName());
        educatorDao.save(educator);

        for (Logger logger : loggers) {
            logger.logMessage(educator.getEducatorName());
        }

    }
}
