package gr.aueb.cf.ch16.abstractclasses;

public class Cat extends Animal {


    @Override
    public void speak() {
        System.out.println("Niaou");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" ... cat ate all her food");
    }
}
