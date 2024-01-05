package gr.aueb.cf.ch16;

public class Main {

    public static void main(String[] args) {
        ISpeakable alice = new Cat();
        ISpeakable bob = new Dog();

        alice.speak();
        bob.speak();

        doSpeak(alice);
        doSpeak(bob);
    }

    /*
     * Polymorphism
     */
    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
