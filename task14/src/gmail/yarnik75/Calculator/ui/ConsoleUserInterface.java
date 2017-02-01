package gmail.yarnik75.Calculator.ui;

import java.util.Scanner;

import gmail.yarnik75.Calculator.Services.SimpleCalculatorService;

public class ConsoleUserInterface implements UserInterface{
	private SimpleCalculatorService _SCS;
	
	public ConsoleUserInterface(SimpleCalculatorService SCS) {
		super();
		_SCS = SCS;
	}

	@Override
	public void start() throws Exception {
		Scanner s = new Scanner(System.in);
		SaveToFile stf = new SaveToFile();
		while (true){
			System.out.println("Input expression");
			String expr = s.nextLine();
			System.out.println(expr + " = " +_SCS.evaluate(expr));
		//	SaveToFile stf = new SaveToFile();
			stf.saveToFile("Query: " + expr + " Result: " +_SCS.evaluate(expr));
		}
		
	}

	
}
