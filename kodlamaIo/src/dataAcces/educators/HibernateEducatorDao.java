package dataAcces.educators;

import entities.Educators;

public class HibernateEducatorDao implements EducatorDao {
    @Override
    public void save(Educators educators) {
        System.out.println("Eğitimci hibernate ile kaydedildi");
    }
}
