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
	vasyaF.addVisa();
	vasyaF.addVisa();
	//vasyaF.addVisa();
	
	
	}

}
