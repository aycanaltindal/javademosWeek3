package entities;

public class Categories {
    String categoryName;

    public Categories(String categoryName) {
        this.categoryName = categoryName;
    }

    public Categories() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
}
