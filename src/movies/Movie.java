package movies;

public class Movie {

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
    private String name;
    private String category;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() { // override
        return name + ", Category: " + category;
    }

    public boolean isInCategory(String category) {
        return this.category.equals(category);
    }
}

