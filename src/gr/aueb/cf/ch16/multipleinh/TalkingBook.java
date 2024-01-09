package gr.aueb.cf.ch16.multipleinh;

public class TalkingBook implements ISpeakable, IReadable {

    @Override
    public void read() {
        System.out.println("Can read!");
    }

    @Override
    public void speak() {
        System.out.println("Can speak!");
    }
}
