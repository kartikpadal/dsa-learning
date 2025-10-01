package linkedlist;

public class Main {
    public static void main(String[] args){
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertLast(2);
        list.insert(8,3);

        list.display();
    }
}

