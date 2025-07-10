
class LLFindFromLast {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //add in first
    public int removeFromLast(int n) {
        if (head.next == null) {
            return -1;
        }
        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        // if(n == size){
        //     return head.next;
        // }

        int indexToSearch = size - n + 1;
        curr = head;
        int i = 1;
        while (i < indexToSearch) {
            curr = curr.next;
            i++;
        }
        return curr.data;

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //print data
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LLFindFromLast list = new LLFindFromLast();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        System.out.println("After deleting nth node from last:");
        int n = 2;
        int result = list.removeFromLast(n);
        list.printList();
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("[ ]");
        }

    }
}
