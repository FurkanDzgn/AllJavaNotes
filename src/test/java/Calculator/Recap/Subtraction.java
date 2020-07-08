package Calculator.Recap;

public class Subtraction extends Question {

	public Subtraction(Range r) {
		super("Subtraction","-");
	   
		int num1=RandomNumber.getRandomInteger(r);
		int num2=RandomNumber.getRandomInteger(r);
		
		operand1=num1;
		operand2=num2;
		
		while(operand1<operand2) {
			num1=RandomNumber.getRandomInteger(r);
			num2=RandomNumber.getRandomInteger(r);
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
