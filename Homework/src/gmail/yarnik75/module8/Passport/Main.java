package gmail.yarnik75.module8.Passport;

public class Main {

	public static void main(String[] args) {
	Passport vasya = new Passport();
	vasya.setfirstName("Vasya");
	System.out.println(vasya.getfirstName());
	ForeignPassport vasyaF = new ForeignPassport();
	vasyaF.setfirstName("VasyaF");
	System.out.println(vasyaF.getfirstName());
	System.out.println(vasyaF.getlastName());
	vasyaF.addVisa("USA", "A", "12-10-2017", "12-11-2017", 10);
	//vasyaF.addVisa("USA", "A", "12-10-2017", "12-11-2017", 10);
	vasyaF.addVisa("USA", "A", "12-10-2017", "12-11-2017", 10);
	System.out.println(vasyaF.getVisa());
	}

}
