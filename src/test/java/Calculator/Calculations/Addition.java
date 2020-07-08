package Calculator.Calculations;

public class Addition extends Question{

	public Addition(Range r) {
		super("Math","+");
		
		int num1 = RandomNumber.getRandomInteger(r);
		int num2 = RandomNumber.getRandomInteger(r);
		operand1 = num1;
		operand2 = num2;
		
	}
	
//	public Addition(String operator,String questionType) {
//		super(questionType, operator);
//	}

	@Override
	public void calc() {
	
		answer = operand1+operand2;
		calculated = true;		
	}

	@Override
	public String toString() {
		
	//	String result="";
		if(calculated) {
			return operand1+"+"+operand2+"="+answer;
			
		}else {
			return operand1+"+"+operand2+"=";
		}
		
	//	return result;
	}

	
	
}
