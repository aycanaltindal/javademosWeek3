package dataAcces.educators;

import entities.Educators;

public class JDBCEducatorDao implements EducatorDao {
    @Override
    public void save(Educators educator) {
        System.out.println("kurs JDBC ile veritabanına kaydedildi" );
    }
}
