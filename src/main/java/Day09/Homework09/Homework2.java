package Day09.Homework09;

public class Homework2 {
	public char scoreToGrade(int num) {
		
		
		if (num<100 && num>80) {
			char result='A';
			System.out.println("scoreToGrade"+"("+num+")"+ "-> will return "+result);
			return result;
		}
		else if(num<79 && num>60){
			char result='B';
			System.out.println("scoreToGrade"+"("+num+")"+ "-> will return "+result);
			return result;
		}
		else if(num<59 && num>40){
			char result='C';
			System.out.println("scoreToGrade"+"("+num+")"+ "-> will return "+result);
			return result;
		}
		else if(num<40 && num>0){
			char result='F';
			System.out.println("scoreToGrade"+"("+num+")"+ "-> will return "+result);
			return result;
		
		}else {
			char result ='X';
			System.out.println("Invalid Value"+result);
			return result;
		}
		
	}

}
