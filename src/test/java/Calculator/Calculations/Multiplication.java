package Calculator.Calculations;

public class Multiplication extends Question{

	public Multiplication(Range r) {
		super("Math","*");
		
		int num1 = RandomNumber.getRandomInteger(r);
		int num2 = RandomNumber.getRandomInteger(r);
		
		operand1=num1;
		operand2=num2;
	}

	@Override
	public void calc() {
		
		
			calculated=true;
			answer=operand1*operand2;
		
		
	}

	@Override
	public String toString() {
		
			if(calculated) {
				return operand1+"*"+operand2+"="+answer;
			}else {
				return operand1+"*"+operand2+"=";
			}	
		
	}
}
