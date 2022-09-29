public class TestDLL {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(8);
        Node n2 = new Node(-3);
        Node n3 = new Node(5);
        Node n4 = new Node(18);
        Node n5 = new Node(34);
        Node newNode = new Node(22);
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.insertAt(newNode, 5);
        dll.printValuesForward();
    }
}
