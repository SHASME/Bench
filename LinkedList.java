

public class LinkedList {
   private Node head;
    // Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insert(Node n) {
        Node temp = head;
        if (head == null) {
            head = n;
        } else {
            while (temp != null) {
                if (temp.getNext() == null) {
                    temp.setNext(n);
                    temp = temp.getNext();
                }
                temp = temp.getNext();

            }
        }
    }

    public void insertAtStart(Node n) {
        Node temp = head;
        if (head == null) {
            head = n;
        } else {
            n.setNext(head);
            head = n;
        }
    }

    public void insertAtEnd(Node n) {
        Node temp = head;
        if (head == null) {
            head = n;
        } else {
            while (temp != null) {
                if (temp.getNext() == null) {
                    temp.setNext(n);
                    // temp = n;
                    temp = temp.getNext();
                }
                temp = temp.getNext();

            }
        }

    }

    public void insertAtMiddle(Node n) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (fast.getNext() == null) {
                n.setNext(slow.getNext());
                slow.setNext(n);
            }
        }
    }

    public void insertAtData(Node n, Object data) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == data) {
                n.setNext(temp.getNext());
                temp.setNext(n);
                temp = temp.getNext();
            }
            temp = temp.getNext();
        }
    }

    public void insertAtPosition(Node n, int index) {
        Node temp = head;
        int pos = 0;
        while (temp != null) {
            if (pos == index) {
                n.setNext(temp.getNext());
                temp.setNext(n);
                temp = temp.getNext();
            }
            temp = temp.getNext();
            pos++;
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            // System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    @Override
    public String toString() {
        return "Lnklst [head=" + head + "]";
    }
}