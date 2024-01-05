package gr.aueb.cf.ch16;

public class SpeakingSchool {
    private final Cat cat;

    public SpeakingSchool() {
        cat = new Cat();
    }

    public void learnToSpeak() {
        cat.speak();
    }
}
