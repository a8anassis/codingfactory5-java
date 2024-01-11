package gr.aueb.cf.ch17.clone;

import java.awt.*;
import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private static final long serialVersionUID = 123456;
    private String name;
    private City city;
    private transient int hashCode;

    public Trainee() {

    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Trainee(Trainee trainee) {
        this.name = trainee.getName();
        this.city = new City(trainee.getCity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city; //new City(city);
    }

    public void setCity(City city) {
        this.city = new City(city.getDescription());
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
//        City city1 = new City(getCity().getDescription());
//        trainee.setCity(city1);
        return trainee;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;

        if (!getName().equals(trainee.getName())) return false;
        return getCity().equals(trainee.getCity());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getCity().hashCode();
        return result;
    }
}
