package business;

import dataAcces.categories.CategoryDao;
import entities.Categories;
import logging.Logger;

import java.util.List;

public class CategoryManager{
    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        super();
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void save(Categories categorie) throws Exception {


        List<Categories> categoriesList =categoryDao.getList();
        for (Categories categories: categoriesList) {
            if(categories.getCategoryName().equals(categorie.getCategoryName())){
                System.out.println("Kurs ismi farkli olmalidir!!!");
                //throw new Exception("Kurs ismi farkli olmalidir!!!");
                return;
            }
        }


        System.out.println(categorie.getCategoryName());
        categoryDao.save(categorie);

        for (Logger logger : loggers) {
            logger.logMessage(categorie.getCategoryName());
        }

    }
}
