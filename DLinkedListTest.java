
public class DLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DoublyLinkedList list=new DoublyLinkedList();
list.isEmpty();
list.insertFirst(45);
list.insertLast(67);
list.printLinkedListForward();
list.insertFirst(20);
list.deleteFirst();
list.printLinkedListBackward();
list.deleteLast();
list.printLinkedListForward();

	}

}
