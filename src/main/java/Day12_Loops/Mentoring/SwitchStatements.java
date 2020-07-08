package Day12_Loops.Mentoring;

public class SwitchStatements {
	public static void main(String[] args) {
		int num=0;
		switch(++num) {
		case 1:
			System.out.println(num);
			++num;
		case 2:
			System.out.println(num);
			++num;
		//	break;
		case 3:
			System.out.println(num);
			++num;
		case 4:
			System.out.println(num);
		default:
		System.out.println(num+num);
		}
	}

}
