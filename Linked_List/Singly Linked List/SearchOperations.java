public class SearchOperations {

    public void linearSearch(LinkedListMathed ll, int key) {
        Node temp = ll.head;
        int i = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Value Found at Position: " + i);
                return;
            }

            temp = temp.next;
            i++;
        }

        System.out.println("Value Not Found");
    }

    public void linearSearchRecursion(
        Node temp, int key, int i) {

        if (temp == null) {
            System.out.println("Value Not Found");
            return;
        }

        if (temp.data == key) {
            System.out.println("Value Found at Position: " + i);
            return;
        }

        linearSearchRecursion(temp.next, key, i + 1);
    }
}
