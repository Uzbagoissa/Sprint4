package manager;

public class MyLinkedList<T> {
    transient Node<T> first;
    transient Node<T> last;
    transient int size = 0;

    public void linkLast(T element) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(null, element, l);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    class Node<T> {
        public T data;
        public Node<T> next;
        public Node<T> prev;

        public Node(Node<T> prev, T data, Node<T> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
