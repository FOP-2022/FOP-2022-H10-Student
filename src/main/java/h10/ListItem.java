package h10;

public class ListItem<T> {
    public ListItem<T> next;
    public T key;

    /**
     * This method creates a new ListItem of type T with the given key
     * @param key is the key of the ListItem to be created
     */
    public ListItem (T key) {
        this.key = key;
    }
}
