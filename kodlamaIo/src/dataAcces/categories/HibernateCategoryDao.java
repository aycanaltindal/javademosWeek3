package dataAcces.categories;

import entities.Categories;
import entities.Courses;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void save(Categories categories) {
        System.out.println("Kategori hibernate ile kaydedildi");
    }

    @Override
    public List<Categories> getList() {
        List<Categories> categories= new ArrayList<>();
        categories.add(new Categories("Software"));
        categories.add(new Categories( "Database"));
        return categories;
    }
}
