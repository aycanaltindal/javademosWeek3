package dataAcces.categories;

import entities.Categories;

import java.util.ArrayList;
import java.util.List;

public class JDBCCategoryDao implements CategoryDao {
    @Override
    public void save(Categories categories) {
        System.out.println("Kategori JDBC ile veritabanına kaydedildi" );
    }

    @Override
    public List<Categories> getList() {
        List<Categories> categories= new ArrayList<>();
        categories.add(new Categories("Software"));
        categories.add(new Categories( "Database"));
        return categories;
    }
}
