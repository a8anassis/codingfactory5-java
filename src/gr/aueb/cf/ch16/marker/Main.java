package gr.aueb.cf.ch16.marker;

public class Main {

    public static void main(String[] args) {
        Book book = new Book(1, "123", "Stallings W.", "TCP/IP Networks");
        Item cd = new CompactDisk(1, "Apples and Oranges");

        deliver(book);
        deliver(cd);
    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Book was delivered");
        } else if (item instanceof CompactDisk) {
            System.out.println("CD was delivered");
        } else {
            throw new RuntimeException();
        }
    }
}
