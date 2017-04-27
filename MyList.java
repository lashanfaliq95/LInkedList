

/**
 * Created by lasha on 3/2/2017.
 */

class Node<T> {
    private T data;
    private Node next;

    //constructor for head or to initialise the list
    Node() {
        this.data = null;
        this.next = null;

    }

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class MyList<T> {
    T data;
    Node head;
    Node previous;

    public MyList() {
        this.head = new Node();
    }

    public MyList(T data) {
        this.head = new Node(data, null);
    }

    public void add(T data) {

        //if adding the first element
        if (head.getData() == null) {
            head.setData(data);
            head.setNext(null);
            previous =head;
        } else {
            Node temp = new Node(data, null);
            previous.setNext(temp);
            previous=temp;
        }
    }

    public boolean isEmpty() {
        if (head.getNext() == null && head.getData() == null)
            return true;
        else
            return false;
    }

    public boolean hasElements() {
        if (head.getData() != null)
            return true;
        else
            return false;
    }

    public T remove() {
        Node temp = head;
        if (isEmpty()==true){
            return null;}
        else {
            head = head.getNext();
            temp = null;
            return   (T)head.getData();
        }


    }


}
