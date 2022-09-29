import java.util.Objects;

public class DLL {
    public Node head;
    public Node tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }

    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;

        // while the current node exists...
        while(current != null) {
            // print its value
            System.out.printf("%s ", current.value);
            // and move on to its next node.
            current = current.next;
        }
        System.out.println();
    }

    public void printValuesBackward() {
        Node current = this.tail;
        while(current != null) {
            System.out.println(current.value);
            current = current.previous;
        }
    }

    public Node pop() {
        Node popped = tail;
        tail = tail.previous;
        tail.next = null;
        return popped;
    }

    boolean contains(Integer value) {
        Node current = head;
        while (current != null) {
            if (Objects.equals(current.value, value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    int size() {
        int numNodes = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
        }
        return numNodes;
    }

//    void insertAt(Node newNode, int index) {
//        int idx = 0;
//        Node current = head;
//        while (idx < index && current != null) {
//            idx++;
//            current = current.next;
//        }
//        if (idx < index) {
//            return;
//        }
//        if (current == head) {
//            head = newNode;
//            newNode.next = current;
//            current.previous = newNode;
//        } else if (current == tail) {
//            newNode.next = current;
//            tail = newNode;
//            current.previous.next = newNode;
//            current.previous = newNode;
//        } else {
//            newNode.previous = current.previous;
//            newNode.next = current;
//            current.previous.next = newNode;
//            current.previous = newNode;
//        }
//    }
}
