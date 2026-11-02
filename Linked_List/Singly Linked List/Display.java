public class Display {

    public void print(LinkedListMathed ll) {

        Node temp = ll.head;

        if (temp == null) {
            System.out.println("Linked List Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
