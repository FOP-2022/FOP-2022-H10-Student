package h10;

/**
 * An object of this class represents a Linked List.
 *
 * @param <T> Type ListItem Objects saved in the LinkedList
 */
public class MyLinkedList<T> {
    public ListItem<T> head;

    /**
     * This method adds a new list item with parameter "key" as its key value to the end of the list.
     *
     * @param key key value of item to be added
     * @return boolean stating if the item has been added to the list successfully
     */
    public boolean add(T key) {
        if (head == null) {
            head = new ListItem<>(key);
            return true;
        }

        ListItem<T> p = head;

        while (p.next != null) {
            p = p.next;
        }

        p.next = new ListItem<>(key);
        return true;
    }
}
