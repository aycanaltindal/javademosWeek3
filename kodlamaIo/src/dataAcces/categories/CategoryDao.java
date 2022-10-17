package dataAcces.categories;

import entities.Categories;
import entities.Courses;

import java.util.List;

public interface CategoryDao {
    void save(Categories category);

    List<Categories> getList();
}
