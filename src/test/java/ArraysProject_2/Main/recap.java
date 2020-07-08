package ArraysProject_2.Main;

import java.util.Arrays;
import java.util.Random;

public class recap {
	/**
	 * You're given strings J representing the types of stones that are jewels,
	 * and S representing the stones you have.  Each character in S is a type of
	 * stone you have.  You want to know how many of the stones you have are also jewels.
	 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
	 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
	 *
	 * Example 1:
	 * Input: J = "aA", S = "aAAbbbb"
	 * Output: 3
	 * Example 2:
	 * Input: J = "z", S = "ZZ"
	 * Output: 0
	 * Note:
	 * S and J will consist of letters and have length at most 50.
	 * The characters in J are distinct.
	 * */
	public int numJewelsInStones(String J, String S) {
		
		int counter=0;
		for(int i=0;i<J.length();i++) {
			for(int k=0;k<S.length();k++) {
				if(J.charAt(i)==S.charAt(k)) {
					counter++;
				}
			}
		}
		return counter;
	}
	
	/**
	 *
	 * Given random integer number, return biggest number which you can create from given int
	 * Example -1
	 * int num=2458;
	 * return 8542;
	 *
	 * Example - 2
	 * int num= 7239;
	 * return 9732;
	 *
	 */

	public int biggestNumber(int randomNum) {
		
		int x=randomNum;
		int counter=0;
		while(x!=0) {
			x/=10;
			counter++;
		}
		int [] arr=new int[counter];
		int y=randomNum;
		int i=0;
		while(y!=0) {
			arr[i]=y%10;
			y=y/10;
			i++;
		}
		Arrays.sort(arr);
		
		int temp=0;
		int w=arr.length-1;
		for(int q=0;q<counter;q++) {
			temp*=10;
			temp=arr[w];
			w--;
		}
		return temp;
	}
	
	/**
	 * Given an array A of non-negative integers,
	 * return an array consisting of all the even elements of A in ascending order,
	 * followed by all the odd elements of A in ascending order.
	 *
	 * You may return any answer array that satisfies this condition.
	 *
	 * Example 1:
	 *
	 * Input: [3,1,2,4]
	 * Output: [2,4,1,3]
	 *
	 * Note:
	 * 1 <= A.length <= 5000
	 * 0 <= A[i] <= 5000
	 */
	public int[] sortArray(int[] A) {
		
		int c1=0;
		int c2=0;
		
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				c1++;
			}else {
				c2++;
			}
		}
		int [] arrE=new int[c1];
		int [] arrO=new int[c2];
		
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				arrE[i]=A[i];
			}else {
				arrO[i]=A[i];
			}
		}
		Arrays.sort(arrE);
		Arrays.sort(arrO);
		
		int[] result = new int[A.length];
		
		int c3=0;
		for(int i=0;i<result.length;i++) {
			result[i]=arrE[i];
			c3++;
		}
		for(int i=0;i<result.length;i++) {
			result[c3]=arrO[i];
		}
		return result;
			
	}
	/**
	 *    Input: words = ["gin", "zen", "gig", "msg"]
	 *    Output: ["--...-.",""--...-.","--...--.","--...--."]
	 * @param words
	 * @return
	 */
	public static String []uniqueMorseRepresentations(String[] words) {
		String morse=".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..";
		
		String [] mors= morse.split(",");
		
		char[] alph=new char[26];
		int i=0;
		for(char ch='a'; ch<'z'; ch++) {
			alph[i]=ch;
			i++;
		}
		
		String [] res=new String[words.length];
		
		for(int k=0;k<words.length;k++) {
			for(int l=0;l<words[k].length();l++) {
				int w = words[k].length();
				for(int r=0;r<w;r++) {
					for(int t=0;t<alph.length;t++) {
						if(words[k].charAt(r)==alph[t]) {
							res[k]+=mors[t];
						}
					}
				}		
			}
		}
		return res;
	}
	/**
	 *
	 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
	 *
	 * Sort the elements of arr1 such that the ascending ordering of items in arr1 are the same as in arr2.
	 * Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
     *
	 * Example 1:
	 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
	 * Output: [1,2,2,2,3,3,4,6,9,7,19]
	 * 	 
	 * Constraints:
	 * arr1.length, arr2.length <= 1000
	 * 0 <= arr1[i], arr2[i] <= 1000
	 * Each arr2[i] is distinct.
	 * Each arr2[i] is in arr1.
	 *
	 */
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		
		Arrays.sort(arr2);
		int[] arr=new int[arr1.length];
		
		int counter=0;
		int x=0;
		for(int i=0;i<arr2.length;i++) {
			for(int k=0;k<arr1.length;k++) {
				if(arr2[i]==arr1[k]) {
					arr[x]=arr1[k];
					x++;
					counter++;
				}
			}
		}
		
		int c= arr1.length-counter;
		int [] str = new int[c];
		
		int y=0;
	Outher:
		for(int i=0;i<arr1.length;i++) {
			for(int k=0;k<arr2.length;k++) {
				if(arr1[i]==arr2[k]) {
					continue Outher;
					
				}
			}
			str[y]=arr1[i];
			y++;
		}
		Arrays.sort(str);
		for(int t=0;t<c;t++) {
			arr[counter]=str[t];
			counter++;
		}
		return arr;
	}
	
	public static int luckyNumbers (int[][] matrix) {
		
		int[] arr=new int[matrix.length];
		int c=0;
		
		for(int i=0; i<matrix.length;i++) {
			for(int k=0;k<matrix[i].length;k++) {
				Arrays.sort(matrix[i]);
				arr[c]=matrix[i][0];
			}
		}
		Arrays.sort(arr);
		return arr[arr.length-1];
		
	}
	public static String motivation () {
        String[] motivations = {"You are the best", "You can do this", "It's too easy for you",
        "Today is one of the best day's in your live", "Nothing is impossible for you"};
        Random random = new Random();
        int index = random.nextInt(motivations.length);
        return motivations[index];
    }
 
	
	
	
	public static void main(String[] args) {
		
		String[] arr = {"gin", "zen", "gig", "msg"};
		
		System.out.println(Arrays.toString(uniqueMorseRepresentations(arr)));
		
		int[][] arr1= {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		
		System.out.println(luckyNumbers(arr1));
		
	     System.out.println("Good morning, Nazgul)");
	        System.out.println(motivation());
	}

}
