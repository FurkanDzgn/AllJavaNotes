package Day20_InterviewQuestions.Practice;

import java.util.Arrays;

public class arrayIsPrime {
	
	public static boolean[] recap(int[] num) {
		
		boolean[] arr = new boolean[num.length];	
	OUTHER:	
		for(int i=0; i<num.length; i++) {
			INNER:
				for(int k=2; k<num[i]; k++) {
				if(num[i]%k==0) {
					arr[i]=false;
				continue OUTHER;
				}
				else {
					arr[i]=true;
				}
			}
		}
		return arr;
	}

	public boolean[] arrayPrime(int[] num) {
	
		boolean [] arrPrm= new boolean[num.length];
	OUTHERLOOP:
		for(int i=0; i<num.length;i++) {
		INNERLOOP:
			for(int a=2; a<num[i];a++ ) {
				if(num[i]%a==0) {
					arrPrm[i]=false;
					continue OUTHERLOOP;
				}else {
					arrPrm[i]=true;
				}
			}
		}
	
		return arrPrm;
	}
	public static void main(String[] args) {
		arrayIsPrime prm= new arrayIsPrime();
		
		int num[]= {14,23,56,19,21,120};
		
		System.out.println(Arrays.toString(prm.arrayPrime(num)));
		
		
		System.out.println("====================");
		
		PrimeNumber pN = new PrimeNumber();
		
		int numbers[]= {14,23,56,19,21,28,199};
		
		boolean [] checkPrm= new boolean[numbers.length];
		
		int count=0;
		for(int number:numbers) {
			boolean primeNum=pN.prime(number); // we use method at primeNumber
			checkPrm[count]=primeNum;
			count++;// count for checkPrm array to store according index numbers
		}
		
		System.out.println(Arrays.toString(checkPrm));
		
		System.out.println("===============");
		
		int numbers1[]= {14,23,56,19,21,28,199};
		
		System.out.println(Arrays.toString(recap(numbers1)));
		
		
		
	}

}
