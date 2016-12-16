package gmail.yarnik75.module8.Array;

public class Array {
	int [] arr0 = new int[0];
	
	public void add(int x){
		int [] array = new int[arr0.length + 1];
		for (int i = 0; i < arr0.length; ++i){
			array[i] = arr0[i];
			}
			array[array.length - 1] = x;
			arr0 = array;
	} 
	
	public void del(int x){
		int ii = -1;
		for (int i = 0; i < arr0.length; ++i){
			if (arr0[i] == x) {
				ii = i;				
			}
		}
		if (ii != -1){int [] array = new int[arr0.length - 1];
			for (int i = 0; i < ii; ++i){
				array [i] = arr0 [i];
			}
			for (int i = ii; i < array.length; ++i){
				array [i] = arr0 [i + 1];
			}
			arr0 = array;
		}else {
			System.err.printf("Element %s"
								+ " is not into this array%n", x);
		}
	}
	
	public void print(){
		for (int i = 0; i < arr0.length; ++i){
			System.out.println(arr0[i]);
		}
	}
	
}
