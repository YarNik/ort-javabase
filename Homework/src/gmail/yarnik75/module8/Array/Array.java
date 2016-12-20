package gmail.yarnik75.module8.Array;

public class Array {
	private int [] arr0 = new int[0];
	
	public void add(int x){
		int [] array = new int[arr0.length + 1];
		for (int i = 0; i < arr0.length; ++i){
			array[i] = arr0[i];
			}
			array[array.length - 1] = x;
			arr0 = new int[arr0.length];
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
			arr0 = new int [arr0.length - 1];
			arr0 = array;
		}else {
			System.err.printf("Element %s"
								+ " is not into this array%n", x);
		}
	}
			
	public int getElement(int ii){
		if (ii < arr0.length){
		return arr0[ii];
		}else {
			System.err.printf("Element with index %s"
					+ " is not into this array%n", ii);
			return 0;
		}
	}
	
	public int getArrayLength(){
		return arr0.length;
	}
	
}
