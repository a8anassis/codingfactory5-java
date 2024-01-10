package gr.aueb.cf.ch17.clone;

public class Trainee implements Cloneable {
    private String name;
    private City city;

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
        return new City(getCity());
    }

    public void setCity(City city) {
        this.city = new City(city.getDescription());
    }

    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        City city1 = new City(getCity().getDescription());
        trainee.setCity(city1);
        return trainee;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
