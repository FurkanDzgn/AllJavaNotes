// Copyright 2020 Techtorial LLC
package ArraysProject_2.Main;

import java.util.Arrays;

public class Main {


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
		for(int i=0; i< J.length(); i++) {
			for(int x=0; x<S.length(); x++) {
				if(J.charAt(i)==S.charAt(x)) {
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

	public int biggestNumber(int randomNum){

		int num=randomNum;
		int counter=0;
	while(num!=0) {
		num/=10;
		counter++;
	}
	
	int[] arr=new int[counter];
	
	for(int i=0; i<counter; i++) {
		arr[i]=randomNum%10;
		randomNum/=10;
	}
	for(int i=0; i<counter; i++) {
	for(int k=i+1; k<counter; k++) {
		if(arr[i]<arr[k]) {
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
		}
	}
	int result=0;
	for(int i=0; i<counter; i++) {
		result*=10;
		result+=arr[i];
	}
		return result;

		
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
		
		for(int i=0; i<A.length; i++) {
			if(A[i]%2==0) {	
				c1++;
			}	}
		
		for(int i=0; i<A.length; i++) {
			if(A[i]%2==1) {
				c2++;
				}
		}
		int[] arr1=new int[c1];
		
		int[] arr2=new int[c2];
		
		for(int b=0,i=0; b<A.length; b++) {
			if(A[b]%2==0) {
				arr1[i]=A[b];
				i++;
			}
		}
		Arrays.sort(arr1);
		
		for(int c=0,i=0; c<A.length; c++) {
			if(A[c]%2==1) {
				arr2[i]=A[c];
				i++;
			}
		}
		Arrays.sort(arr2);
		
		int[] arr3=new int[A.length];
		
		for(int q=0;q<c1;q++) {
			arr3[q]=arr1[q];	
		}
		for(int i=c1, r=0; i<A.length; i++) {
			arr3[i]=arr2[r];
			r++;
		}
		return arr3;

	}




	/**
	 * International Morse Code defines a standard encoding where each letter is mapped
	 * to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...",
	 *  "c" maps to "-.-.", and so on.
	 * For convenience, the full table for the 26 letters of the English alphabet is given below as string separated with comma:
	 *
	 *
	 * ".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--.."
	 *
	 * Now, given a list of words, each word can be written as a concatenation
	 * of the Morse code of each letter. For example, "cba" can be written
	 * as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-").
	 * We'll call such a concatenation, the transformation of a word.
	 * Return the String array of different transformations among all words we have.
	 * Example:
	 * Input: words = ["gin", "zen", "gig", "msg"]
	 * Output: ["--...-.",""--...-.","--...--.","--...--."]
	 * Explanation:
	 * The transformation of each word is:
	 * "gin" -> "--...-."
	 * "zen" -> "--...-."
	 * "gig" -> "--...--."
	 * "msg" -> "--...--."
	 *
	 * Note:
	 * The length of words will be at most 100.
	 * Each words[i] will have length in range [1, 12].
	 * words[i] will only consist of lowercase letters.
	 *
	 */
	public String []uniqueMorseRepresentations(String[] words) {
		String morse=".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..";
		
		String[] mor=morse.split(",");
		
		char[] alph=new char[26];
		
		int i=0;
		for(char ch='a' ; ch<='z'; ch++) {
			alph[i]=ch;
			i++;
		}
		String result="";
	
         for(int a=0; a<words.length; a++) {
        	 for(int k=0; k<words[a].length(); k++) {
			   for(int q=0; q<alph.length; q++) {
				   if(words[a].charAt(k)==alph[q]) {
					   result+=mor[q];
				   }
			   }
        	 }
        	  result+=",";
		}
		words=result.split(",");
     
		return words;
		
		
//		    String [] result = new String[words.length];
//        
//        for (int i=0; i<words.length; i++) 
//            result[i] = toMorseRepresentation(words[i]);
//        
//        return result;
//    }
//    public static String toMorseRepresentation(String word) {
//        
//        String morse = ".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..";
//        
//        String[] morseArr = morse.split(",");
//        
//        int ascii = 97;
//        
//        char[] alphaphit = new char[26];
//        
//        for (int i=0; ascii<=122; ascii++, i++) {
//            alphaphit[i] = (char) ascii;
//        }
//        
//        String result ="";
//        
//        for (int i=0; i<word.length();i++) {
//            for (int x=0; x<alphaphit.length; x++) {
//                if (word.charAt(i)==alphaphit[x])
//                    result += morseArr[x];
//            }
//        }
//        
//        return result;

		 
	}

	/**
	 *
	 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
	 *
	 *
	 * Sort the elements of arr1 such that the ascending ordering of items in arr1 are the same as in arr2.
	 * Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.

	 * Example 1:
	 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
	 * Output: [1,2,2,2,3,3,4,6,9,7,19]
	 * 
	 * 
	 *
	 *
	 *
	 * Constraints:
	 * arr1.length, arr2.length <= 1000
	 * 0 <= arr1[i], arr2[i] <= 1000
	 * Each arr2[i] is distinct.
	 * Each arr2[i] is in arr1.
	 *
	 */
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] arr3=new int[arr1.length];
		int counter=0;
	
		Arrays.sort(arr2);
		int x=0;
		for(int i=0; i<arr2.length; i++) {
			for(int b=0; b<arr1.length; b++) {
				if(arr2[i]==arr1[b]) {
					arr3[x]=arr1[b];	
					x++;                               // 
					counter++; // elements count arr3
				}
			}
		}
		
		int c=arr1.length-counter;
		
		
		int arr4[]= new int[c];
	
		
		int	a=0;
	OUTHER:
		for(int i=0; i<arr1.length; i++) {
	INNER:
		for(int b=0; b<arr2.length; b++) {
				if(arr2[b]==arr1[i]) {
					continue OUTHER;	
				}	
			}
		arr4[a]=arr1[i];
		a++;
		}
		
		Arrays.sort(arr4);
		for(int i=0; i<c; i++) {
			arr3[counter]=arr4[i];	
			counter++;
		}
		return arr3;
	}

	/**
	 * Given a m * n matrix of distinct numbers, return all lucky number in the matrix in any order.
	 *
	 * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
	 * Array needs to be sorted to be able to find the lucky number.
	 * Example 1:
	 * Input: matrix = [[7,3,8],[9,13,11],[17,16,15]]  3  9  15
	 *                  3,7,8   
	 *
	 * Output: [15]
	 * Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column
	 * Example 2:
	 *
	 * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
	 *
	 * Output: [12]
	 * Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
	 * Example 3:
	 *
	 * Input: matrix = [[7,8],[1,2]]  --> 7,8      ,1,2
	 * Output: [7]
	 *
	 * Constraints:
	 * m == mat.length
	 * n == mat[i].length
	 * 1 <= n, m <= 50
	 * 1 <= matrix[i][j] <= 10^5.
	 * All elements in the matrix are distinct.
	 */

	public int luckyNumbers (int[][] matrix) {

	int lengthOfMtx=matrix.length;
	int []arr=new int[matrix.length];
	
	for(int i=0; i<matrix.length; i++) {
		Arrays.sort(matrix[i]);
		arr[i]=matrix[i][0];
	}
//	int []arr=new int[matrix.length];
	
//	for(int i=0; i<matrix.length; i++) {
//		arr[i]=matrix[i][0];
//	}
	Arrays.sort(arr);
	
    	return arr[arr.length-1];
	}

	/**
	 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
	 *
	 * We would like to convert the sentence to "Strange Latin"
	 *
	 * The rules of Strange Latin are as follows:
	 *
	 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
	 * For example, the word 'apple' becomes 'applema'.
	 *
	 * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
	 * For example, the word "speak" becomes "peaksma".
	 *
	 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
	 * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
	 * Return the final sentence representing the conversion from S to Strange Latin.
	 *
	 * Example 1:
	 * Input: "I speak Latin"
	 * Output: "imaa peaksmaaa atinLmaaaa"
	 * Example 2:
	 *
	 * Input: "The quick brown fox jumped over the lazy dog"
	 * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
	 *
	 * Notes:
	 * S contains only uppercase, lowercase and spaces. Exactly one space between each word.
	 * 1 <= S.length <= 150.
	 *
	 */

	public String strangeLatin(String input){

		input=input.toLowerCase();
		String[] arr=input.split(" ");
		
		String letter="a";
		OUTHER:
			for(int i=0; i<arr.length; i++) {
				
			if(arr[i].startsWith("a")  || arr[i].startsWith("e") || arr[i].startsWith("i")
					|| arr[i].startsWith("o") || arr[i].startsWith("u") ) {
				
				for(int x=0; x<arr.length; x++) {
				arr[i]+="ma"+letter;
				letter+="a";
				continue OUTHER;
				}
			}
			else {
				
				for(int x=0; x<arr.length; x++) {
				arr[i]=arr[i].substring(1)+arr[i].charAt(0)+"ma"+letter;
				letter+="a";
				continue OUTHER;
				}
			}
		}
		
		String result="";
		for(int i=0; i<arr.length; i++) {
			result+=arr[i]+" ";
		}
		

		return result;
	}
	/*
	 *   String result ="";
        String[] arr = input.split(" ");
        for(int i=0;i<arr.length; i++) {
            result += (toLatin(arr[i]) + "a".repeat(i+1)+" ");
        }
        
        return result;
    }
    
    public String toLatin(String word) {
        
        if(word.charAt(0)=='a' || word.charAt(0)=='e'|| word.charAt(0)=='u' || word.charAt(0)=='i' || word.charAt(0)=='e' || 
                word.charAt(0)=='A' || word.charAt(0)=='E'|| word.charAt(0)=='U' || word.charAt(0)=='I' || word.charAt(0)=='E')
            return word.concat("ma");
        
        return word.substring(1).concat(""+word.charAt(0)).concat("ma");
	 */
}
