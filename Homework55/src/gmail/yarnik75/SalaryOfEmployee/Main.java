package gmail.yarnik75.SalaryOfEmployee;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
		HourlyEmployee h1 = new HourlyEmployee("Ivanov","Hourly", 25);
		HourlyEmployee h2 = new HourlyEmployee("Petrov","Hourly", 20);
		HourlyEmployee h3 = new HourlyEmployee("Sidorov","Hourly", 29);
		HourlyEmployee h4 = new HourlyEmployee("Pupkin","Hourly", 35);
		WageEmployee w1 = new WageEmployee("Bender","Wage", 5500);
		WageEmployee w2 = new WageEmployee("Balaganov","Wage", 1500);
		WageEmployee w3 = new WageEmployee("Panikovsky","Wage", 990);
		WageEmployee w4 = new WageEmployee("Kozlevich","Wage", 800);
		WageEmployee w5 = new WageEmployee("Koreyko","Wage", 3000);
		WageEmployee w6 = new WageEmployee("Berlaga","Wage", 800);
		WageEmployee w7 = new WageEmployee("Shvejk","Wage", 1500);
		
		Employee [] h = {h1, h2, h3, h4, w1, w2, w3, w4, w5, w6, w7};
		//System.out.println(Arrays.toString(h));
		
		Arrays.sort(h, new SalaryComparator());
		
		//   item A
		for(int i = 0; i < h.length; ++i) {
		 			System.out.println(h[i]);
		 		}
		
		//   item B		
		for (int i = 0; i < 5; ++i){
					System.out.println(h[i].get_name());
				}
		
		//   item C
		for (int i = h.length - 3; i < h.length; ++i) {
					System.out.println(h[i].get_id());
		}
	}

}


class SalaryComparator implements Comparator<Employee> {
	 
	 	@Override
	 	public int compare(Employee o1, Employee o2) {
	 		int result = - Integer.compare((int)o1.countSalary(), (int)o2.countSalary());
	 		if (result == 0){result = o1.get_name().compareTo(o2.get_name());
	 			
	 		}
	 		return result;
	 	}
	 	
	 }
