package Calculator.Calculations;

public class Subtraction extends Question {

	public Subtraction(Range r) {
		super("Math","-");
		
		operand1 = RandomNumber.getRandomInteger(r);
		operand2 = RandomNumber.getRandomInteger(r);
		
		while(operand1<operand2) {
			operand1 = RandomNumber.getRandomInteger(r);
			operand2 = RandomNumber.getRandomInteger(r);
		}
			
	}

	@Override
	public void calc() {
		
			calculated=true;
			answer=operand1-operand2;
		
		
	}
	
	public String toString() {
		
		if(calculated) {
			return operand1+"-"+operand2+"="+answer;
		}else {
			return operand1+"-"+operand2+"=";
		}
	}

}
