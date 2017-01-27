package gmail.yarnik75.Calculate;
import gmail.yarnik75.Calculator.Services.SimpleCalculatorService;
import gmail.yarnik75.Calculator.ui.ConsoleUserInterface;
import gmail.yarnik75.Calculator.ui.UserInterface;

public class Main {

	public static void main(String[] args) {
		try {
			UserInterface ui =
				new ConsoleUserInterface(SimpleCalculatorService.getCalculatorService());
			ui.start();
		} catch (Exception e) {
			System.err.println("something happened is not right:(");
			e.printStackTrace();
		}
			
	
	}

}
