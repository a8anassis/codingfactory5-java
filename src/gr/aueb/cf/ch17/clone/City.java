package gr.aueb.cf.ch17.clone;

import java.util.Objects;

public class City implements Cloneable {
    private String description;

    public City() {

    }

    public City(String description) {
        this.description = description;
    }

    public City(City city) {
        this.description = city.getDescription();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if ((obj == null) || (getClass() != obj.getClass())) return false;
//        City city = (City) obj;
//        // return getDescription().equals(city.getDescription());
//        return Objects.equals(getDescription(), city.getDescription());
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        return Objects.equals(description, city.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription());
    }
}
