package gmail.yarnik75.module8.SinglyLinkedList;

public class List {
	private Node head;
	private Node tail;
	
	public void add (double date){
		Node n = new Node();
		n._date = date;
		if (tail == null){                        // if List was empty
			head = n;
			tail = n;
		}else {
			tail._next = n;
			tail = n;
		}
	}
	
	public void del (double date){
		int i = 0;
		if (head == null){                        // if List is empty
			return;
		}
		if (head == tail && head._date == date){  // if List contains 1 Element
			head = null;
			tail = null;
			i++;
			return;
		}
		if (head._date == date){                  // if Element is first (head)
			head = head._next;
			i++;
			return;
		}
		Node t = head;
		while (t._next != null){
			if (t._next._date == date){
				if(t._next == tail){              // if Element is last (tail)
					tail = t;
				}
				t._next = t._next._next;
				i++;
				return;
			}
			t = t._next;
		}
		if (i == 0){
			System.out.println();
			System.out.print("Element " + date + " is not in this List");
		}
	}
	
	public void printList(){
		Node t = head;
		while (t != null){
			System.out.print(t._date + " ");
			t = t._next;
		}
	}
	
}
