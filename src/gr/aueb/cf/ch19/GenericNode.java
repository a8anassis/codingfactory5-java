package gr.aueb.cf.ch19;

public class GenericNode<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "GenericNode{" +
                "item=" + item +
                '}';
    }
}
