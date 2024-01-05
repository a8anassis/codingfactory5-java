package gr.aueb.cf.ch16;

public class SchoolApp {

    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat();
        ISpeakable blackDog = new Dog();

        // Wiring
        GenericSpeakingSchool aliceSpeakingSchool = new GenericSpeakingSchool(whiteCat);
        GenericSpeakingSchool bobSpeakingSchool = new GenericSpeakingSchool(blackDog);
    }
}
