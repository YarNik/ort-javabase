package gmail.yarnik75.SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		List l1 = new List();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(23.44);
		l1.add(23);
		l1.add(233.1);
		l1.add(11.34);
		l1.printList();
	//	l1.del(1);
	//	l1.del(11.34);
		l1.del(3);
		l1.del(333);
		System.out.println();
		l1.printList();

	}

}
