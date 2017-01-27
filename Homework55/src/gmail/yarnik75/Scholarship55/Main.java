package gmail.yarnik75.Scholarship55;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Students Vasya = new Students("Vasya", "Pupkin", "Hottabich", "MO-07");
		Students V2 = new Students("Kolya", "Drypcin", "", "MO-07");
		Students V3 = new Students("Petya", "Zidkin", "", "MO-456");
		Students V4 = new Students("Sasha", "Moskin", "", "MO-07");
		Students V5 = new Students("Pasha", "Duzkin", "", "MO-07");
		Students V6 = new Students("Andrey", "Fokin", "", "MO-456");
		Students V7 = new Students("Vitaly", "Trushkin", "", "MO-456");
		
//		System.out.println(Vasya.get_lastName());
		Vasya.addMark(3);
		Vasya.addMark(3);
		Vasya.addMark(3);
		Vasya.addMark(4);
		V2.addMark(4); V2.addMark(5); V2.addMark(5); V2.addMark(4); V2.addMark(4);
		V3.addMark(4); V3.addMark(4); V3.addMark(4); V3.addMark(4);
		V4.addMark(5); V4.addMark(5); V4.addMark(5);
		V5.addMark(3); V5.addMark(4); V5.addMark(3); V5.addMark(4);
		V6.addMark(4); V6.addMark(4); V6.addMark(4); V6.addMark(4);
		V7.addMark(5); V7.addMark(4); V7.addMark(5); V7.addMark(4);
	//	Vasya.add_Mark(5);
	//	Vasya.add_Mark(4);
		System.out.println(Vasya.sumOfGrand());
         
		Students [] st = {Vasya, V2, V3, V4, V5, V6, V7};
		System.out.println(Arrays.toString(st));
		Arrays.sort(st, new StudentComparator());
		for (int i = 0; i < st.length; ++i){
			if(st[i].sumOfGrand() != 0){
				System.out.println(st[i]);
			}
		}
		
	}
}

	class StudentComparator implements Comparator <Students> {
		@Override
	 	public int compare(Students s1, Students s2) {
	 		int result = s1.getGroup().compareTo(s2.getGroup());
	 		if (result == 0){result = s1.getLastName().compareTo(s2.getLastName());
	 		}
	 	return result;
	 	}
	 }

