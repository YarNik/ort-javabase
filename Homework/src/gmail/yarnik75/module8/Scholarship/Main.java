package gmail.yarnik75.module8.Scholarship;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Students Vasya = new Students("Vasya", "Pupkin", "Hottabich", "MO-07");
		Students V2 = new Students("Vasya", "Drypcin", "", "MO-07");
		Students V3 = new Students("Vasya", "Zidkin", "", "MO-456");
		Students V4 = new Students("Vasya", "Moskin", "", "MO-07");
		Students V5 = new Students("Vasya", "Duzkin", "", "MO-07");
		Students V6 = new Students("Vasya", "Fokin", "", "MO-456");
		Students V7 = new Students("Vasya", "Trushkin", "", "MO-456");
		
//		System.out.println(Vasya.get_lastName());
		Vasya.add_Mark(4);
		Vasya.add_Mark(4);
		Vasya.add_Mark(5);
		Vasya.add_Mark(4);
		V2.add_Mark(4); V2.add_Mark(5); V2.add_Mark(5); V2.add_Mark(4); V2.add_Mark(4);
		V3.add_Mark(4); V3.add_Mark(4); V3.add_Mark(4); V3.add_Mark(4);
		V4.add_Mark(5); V4.add_Mark(5); V4.add_Mark(5);
		V5.add_Mark(3); V5.add_Mark(4); V5.add_Mark(3); V5.add_Mark(4);
		V6.add_Mark(4); V6.add_Mark(4); V6.add_Mark(4); V6.add_Mark(4);
		V7.add_Mark(5); V7.add_Mark(4); V7.add_Mark(5); V7.add_Mark(4);
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
	 		int result = s1.get_group().compareTo(s2.get_group());
	 		if (result == 0){result = s1.get_lastName().compareTo(s2.get_lastName());
	 		}
	 	return result;
	 	}
	 }

