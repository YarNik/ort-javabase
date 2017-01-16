package gmail.yarnik75.Array;

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
		array.add(8888);
	//	array.del(34);
		array.del(13);
	//	array.del(18);
	//	array.del(88);
	//	System.out.println(array.getElement(3));
	
		for (int i = 0; i < array.getArrayLength(); ++i){
			System.out.println(array.getElement(i));
		}
		
		System.out.println(array.getElement(13));
		
		
	}

}
