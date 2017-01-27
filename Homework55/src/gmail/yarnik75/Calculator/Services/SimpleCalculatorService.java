package gmail.yarnik75.Calculator.Services;

public class SimpleCalculatorService implements CalculatorService{
	
	private static SimpleCalculatorService _calculatorService;
	static {
		_calculatorService = new SimpleCalculatorService();
	}
	
	public static SimpleCalculatorService getCalculatorService(){
		return _calculatorService;
	}
	
	@Override
	public double evaluate(String expression) throws Exception{
		expression = calcMultDivSequences(expression);
		double result = calcSequence(expression);
		return result;
	}

	private double calcSequence(String expression) {
		int index = 0;
        double result = 1.0;
        char prevSign = '*';
        int prevSignIndex = -1;
        char currentChar;
   //     try{
        while( true ){
            currentChar = expression.charAt( index );
            if( currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/'){
                result = calc( result,
                        Double.parseDouble(expression.substring( prevSignIndex + 1, index )),
                        prevSign
                    );
                prevSign = currentChar;
                prevSignIndex = index;
            }else if( index == expression.length() - 1 ){
                result = calc( result,
                        Double.parseDouble(expression.substring( prevSignIndex + 1, index + 1 )),
                        prevSign
                    );
                break;
            }
            index++;
        }
		return result;
      //  } catch (NumberFormatException e){
      //  	System.out.println("You entered wrong data");
      //  } finally {return result;}
	}

	private double calc(double result, double number, char sign) {
		 switch (sign){
         case '+':{
             result += number;
             break;
         }case '-':{
             result -= number;
             break;
         }case '*':{
             result *= number;
             break;
         }case '/':{
             result /= number;
             break;
         }
     }
		return result;
	}

	private String calcMultDivSequences(String expression){
		int index = expression.length() - 1;
        int lastPlusOrMinusIndex = expression.length();
        char currentChar;
        while( -1 < index  ){
            currentChar = expression.charAt(index);
            if( currentChar == '+' || currentChar == '-'  ){
                expression = expression.substring( 0 , index + 1 ) +
                            calcSequence( expression.substring( index + 1, lastPlusOrMinusIndex ) ) +
                            expression.substring( lastPlusOrMinusIndex );
                lastPlusOrMinusIndex = index;
            }
            index--;
        }
        System.out.println(expression);
		return expression;
	}

}
