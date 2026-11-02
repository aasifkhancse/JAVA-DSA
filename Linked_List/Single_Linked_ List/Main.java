public class Main {

    public static void main(String[] args) {

        LinkedListMathed ll = new LinkedListMathed();

        AddOperations add = new AddOperations();

        DeleteOperations delete = new DeleteOperations();

        SearchOperations search = new SearchOperations();

        Display display = new Display();

        // Add Head
        add.addHead(ll, 30);
        add.addHead(ll, 20);
        add.addHead(ll, 10);

        display.print(ll);

        // Add Middle
        add.addMiddle(ll, 80, 2);
        display.print(ll);

        // Add Tail
        add.addTail(ll, 50);
        add.addTail(ll, 60);
        add.addTail(ll, 70);

        display.print(ll);

        // Size
        System.out.println("Size: " + ll.size);

        // Remove Head
        delete.removeHead(ll);
        display.print(ll);

        // Remove Tail
        delete.removeTail(ll);
        display.print(ll);

        // Remove Middle
        delete.removeMiddle(ll, 2);
        display.print(ll);

        // Search
        search.linearSearch(ll, 30);
        search.linearSearchRecursion(ll.head, 30, 1);

        // Remove Nth Tail
        delete.removeNthTail(ll, 2);
        display.print(ll);
    }
}
