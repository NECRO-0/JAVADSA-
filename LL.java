class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void print() {
        Node temp = head;
        System.out.println("");
        while (temp != null) {
            System.out.print("\t" + temp.data);
            temp = temp.next;
        }
         
    }

    public void reverse(Node current) {
        if (current == null) {
            return;
        }
        reverse(current.next);
        System.out.print("\t" + current.data);
    }

    public static void main(String[] args) {
        LL l = new LL();
        l.add(4);
        l.add(5);
        l.add(9);
        l.print();
        System.out.print("\n");
        l.reverse(l.head);
    }
}
