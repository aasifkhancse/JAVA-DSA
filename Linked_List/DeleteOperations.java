public class DeleteOperations {

    public void removeHead(LinkedListMathed ll) {
        if (ll.head == null) {
            System.out.println("Linked List Empty");
            return;
        }

        System.out.println("Remove Data: " + ll.head.data);

        ll.head = ll.head.next;
        ll.size--;

        if (ll.head == null) {
            ll.tail = null;
        }
    }

    public void removeTail(LinkedListMathed ll) {
        if (ll.head == null) {
            System.out.println("Linked List Empty");
            return;
        }

        if (ll.head == ll.tail) {
            removeHead(ll);
            return;
        }

        Node prev = ll.head;

        while (prev.next != ll.tail) {
            prev = prev.next;
        }

        System.out.println("Remove Data: " + ll.tail.data);

        prev.next = null;
        ll.tail = prev;
        ll.size--;
    }

    // Remove by position (1-based)
    public void removeMiddle(LinkedListMathed ll, int k) {
        if (k <= 0 || k > ll.size) {
            System.out.println("Invalid position");
            return;
        }

        if (k == 1) {
            removeHead(ll);
            return;
        }

        Node temp = ll.head;

        for (int i = 1; i < k - 1; i++) {
            temp = temp.next;
        }

        System.out.println("Remove Data: " + temp.next.data);

        if (temp.next == ll.tail) {
            ll.tail = temp;
        }

        temp.next = temp.next.next;
        ll.size--;
    }

    // Remove Nth node from end
    public void removeNthTail(LinkedListMathed ll, int k) {
        if (k <= 0 || k > ll.size) {
            System.out.println("Invalid position");
            return;
        }

        removeMiddle(ll, ll.size - k + 1);
    }
}
