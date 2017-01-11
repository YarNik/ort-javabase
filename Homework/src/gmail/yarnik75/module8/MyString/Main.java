package gmail.yarnik75.module8.MyString;

public class Main {

	public static void main(String[] args) {
		
		MyString ms1 = new MyString();
		ms1.add('w');
		ms1.add('Y');
		ms1.add('S');
		ms1.add('n');
		ms1.add('p');
		ms1.add('q');		
		
	//	System.out.println(ms1.getElement(2));
	//	System.out.println(ms1.size());
	//	for (int i = 0; i < ms1.size(); ++i){
	//		System.out.print(ms1.getElement(i));			
	//	}
		
		char [] y = {'u','l','R','M','n'};
		ms1.addArray(y);
	//	System.out.println(ms1.size());
		for (int i = 0; i < ms1.size(); ++i){
			System.out.print(ms1.getElement(i));			
		}
		System.out.println();
		System.out.println(ms1.size());
		ms1.delElement('n');
		System.out.println(ms1.size());
		ms1.delElement('n');
		System.out.println(ms1.size());
		
		for (int i = 0; i < ms1.size(); ++i){
			System.out.print(ms1.getElement(i));			
		}
	}

}
