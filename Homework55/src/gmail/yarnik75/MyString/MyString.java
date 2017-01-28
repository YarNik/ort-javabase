package gmail.yarnik75.MyString;

public class MyString {
	private char [] str0 = new char [0];
	
	public void add(char x){
		char [] temp = new char[str0.length + 1];
		for (int i = 0; i < str0.length; ++i){
			temp[i] = str0[i];
		}
		temp[temp.length - 1] = x;
		str0 = temp;
	}
	
	public char getElement(int ii){
		if (ii < str0.length){
			return str0[ii];
			}else {
				System.err.printf("Element with index %s"
						+ " is not into this array%n", ii);
				return 0;
			}
	}
	
	public void addArray(char [] x){
		char [] temp = new char[str0.length + x.length];
		for (int i = 0; i < str0.length; ++i){
			temp[i] = str0[i];
		}
		for (int i = str0.length; i < temp.length; ++i){
			temp[i] = x[temp.length - 2 * str0.length - x.length + i];
		}
		str0 = temp;
	}
	
	public int size(){
		return str0.length;
	}
	
	public void delElement(char x){
		int ii = -1;
		for (int i = 0; i < str0.length; ++i){
			if (str0[i] == x) {
				ii = i;
			}
		}
		if (ii != -1){char [] temp = new char[str0.length - 1];
			for (int i = 0; i < ii; ++i){
				temp [i] = str0 [i];
			}
			for (int i = ii; i < temp.length; ++i){
				temp [i] = str0 [i + 1];
			}
			str0 = new char [str0.length - 1];
			str0 = temp;
		}else {
			System.err.printf("Element %s"
								+ " is not into this array%n", x);
		}
	}

}
