public class AddOperations {

    public void addHead(LinkedListMathed ll, int data) {
        Node temp = new Node(data);
        ll.size++;

        if (ll.head == null) {
            ll.head = ll.tail = temp;
            return;
        }

        temp.next = ll.head;
        ll.head = temp;
    }

  

    public void addTail(LinkedListMathed ll, int data) {
        Node temp = new Node(data);
        ll.size++;

        if (ll.head == null) {
            ll.head = ll.tail = temp;
            return;
        }

        ll.tail.next = temp;
        ll.tail = temp;
    }


  
    public void addMiddle(LinkedListMathed ll, int data, int k) {
        if (k < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (k == 0) {
            addHead(ll, data);
            return;
        }

        Node temp = ll.head;
        int i = 0;

        while (i < k - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            addTail(ll, data);
            return;
        }

        Node mid = new Node(data);
        mid.next = temp.next;
        temp.next = mid;

        ll.size++;

        if (mid.next == null) {
            ll.tail = mid;
        }
    }
}
