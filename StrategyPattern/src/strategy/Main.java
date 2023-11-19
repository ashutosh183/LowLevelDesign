package strategy;

public class Main {
    public static void main(String[] args) {
        NumStore numStore = new NumStore(new OrderedInserter(), new BinarySearcher());
        numStore.insert(12);
        numStore.insert(1);
        numStore.insert(0);
        numStore.insert(100);

        int value = numStore.search(0);
        System.out.println(value);
    }
}
