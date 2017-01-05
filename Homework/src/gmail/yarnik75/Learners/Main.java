package gmail.yarnik75.Learners;

public class Main {

	public static void main(String[] args) {
		Learner l1 = new Learner();
		
		l1.add("Bybyshko", 2, 2, 3, 4, 5);
		l1.add("Perebiynis", 4, 6, 3, 5, 3);
		System.out.println(l1.view());
	}

	
}