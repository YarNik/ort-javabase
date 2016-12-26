package gmail.yarnik75.module8.Library;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Reader r1 = new Reader("Harry", "Potter", "", 2345, "Griffyndor", "1984", "345-34-86");
		Reader r2 = new Reader("Hermiona", "Greinger", "", 8585, "Griffyndor", "1985", "455-67-76");
		Reader r3 = new Reader("Ron", "Uizly", "", 5374, "Griffyndor", "1984", "345-34-86");
		Reader r4 = new Reader("Jinny", "Uizly", "", 2686, "Griffyndor", "1987", "345-34-43");
		Reader r5 = new Reader("Draco", "Malfoy", "", 2350, "Slizerind", "1983", "345-34-86");
		Reader r6 = new Reader("Goil", "Crabb", "", 6342, "Slizerind", "1984", "345-34-86");
		Reader r7 = new Reader("Fred", "Uizly", "", 7432, "Griffyndor", "1980", "345-34-85");
		
		Reader [] arr = {r1, r2, r3, r4, r5, r6, r7};
		
		System.out.println(Arrays.toString(arr));
		
		//  search for last name
		for (int i = 0; i < arr.length; ++i){
			if(arr[i].get_lastName() == "Uizly"){
				System.out.println(arr[i]);
			}
		}
		System.out.println();
		
		//  search for faculty
		for (int i = 0; i < arr.length; ++i){
			if (arr[i].get_faculty() == "Slizerind"){
				System.out.println(arr[i]);
			}
		}
	}
}
