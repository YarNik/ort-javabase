package gmail.yarnik75.module8.Array;

public class Main {

	public static void main(String[] args) {
		Array array = new Array();
		array.add(13);
		array.add(23);
		array.add(34);
		array.add(35);
		array.add(88);
		array.add(54);
		array.add(34);
		array.add(444);
		array.add(99999);		
		array.print();
		array.del(34);
		array.del(13);
		array.print();
		array.del(18);
	}

}
