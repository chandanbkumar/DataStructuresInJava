package LinkedList;

public class LinkedListDriver {

	public static void main(String[] args) {
		SingleLinkedList l = new SingleLinkedList();
		l.addLast(1);l.addFirst(2);
		l.add(3,l.length());
		l.deleteFirst();
		l.displayList();
		System.out.println(l.length());
		l.addLast(4);
		l.addFirst(5);l.addFirst(6);
		l.addLast(7);l.addLast(8);
		l.addFirst(9);l.displayList();
		System.out.println("se"+l.search(4));System.out.println(l.length());
		l.delete(9);
		l.displayList();
	}

}
