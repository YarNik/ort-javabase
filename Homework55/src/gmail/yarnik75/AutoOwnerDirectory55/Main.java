package gmail.yarnik75.AutoOwnerDirectory55;

//import java.util.Map;

public class Main {

	public static void main(String[] args) {
		AutoOwnerDirectory a1 = new AutoOwnerDirectory();
		
		a1.add("AE4372AK", "Pupkin Vasya");
		a1.add("AE4000AK", "Pupkin Vasya");
		a1.add("AE6759AA", "Ivanov Petya");
		a1.add("AE4775EA", "Ivanov Kostya");
		a1.add("AE9786AA", "Sinizin Petya");
		a1.add("AE6464AA", "Kukuskina Sveta");
		a1.add("AE5430AA", "Ivanova Olya");
		a1.add("AE0010AA", "Dusko Petya");
		a1.add("AE6119AO", "Ivano Petro");
		
		a1.printDirectory();
		a1.deleteKey("AE6119AO");
		a1.deleteKey("A119AO");
		a1.changeKey("AE5430AA", "Kolya Ostenbakin");
		a1.changeKey("AE50AA", "Kolya Ostenbakin");
		System.out.println(a1.foundKey("AE001AA"));
		a1.printDirectory();
		
		}

}
