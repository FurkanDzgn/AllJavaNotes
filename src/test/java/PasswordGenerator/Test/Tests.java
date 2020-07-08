package PasswordGenerator.Test;

//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import Main.PasswordGenerator;
//
//public class Tests {
//
//	PasswordGenerator pGen = new PasswordGenerator();
//
//	@Test
//	public void getRandomUppercaseLettersTest1() {
//		String retv = pGen.getRandomUppercaseLetters(3);
//		checkIfInValidUpper(retv,3);
//	}
//
//	@Test
//	public void getRandomUppercaseLettersTest2() {
//		String retv = pGen.getRandomUppercaseLetters(10);
//		checkIfInValidUpper(retv,10);
//	}
//
//	@Test
//	public void getRandomLowercaseLettersTest1() {
//		String retv = pGen.getRandomLowercaseLetters(3);
//		checkIfInValidLower(retv,3);
//	}
//
//	@Test
//	public void getRandomLowercaseLettersTest2() {
//		String retv = pGen.getRandomLowercaseLetters(10);
//		checkIfInValidLower(retv,10);
//	}
//
//	@Test
//	public void getRandomSpecialCharsTest1() {
//		String retv = pGen.getRandomSpecialChars(3);
//		checkIfInValidChars(retv,3);
//	}
//
//	@Test
//	public void getRandomSpecialCharsTest2() {
//		String retv = pGen.getRandomSpecialChars(10);
//		checkIfInValidChars(retv,10);
//	}
//
//	@Test
//	public void getRandomNumbersTest1() {
//		String retv = pGen.getRandomNumbers(3);
//		checkIfInValidNums(retv,3);
//	}
//
//	@Test
//	public void getRandomNumbersTest2() {
//		String retv = pGen.getRandomNumbers(10);
//		checkIfInValidNums(retv,10);
//	}
//
//	@Test
//	public void encryptCharTest1() {
//		String retv = pGen.encryptChar("T");
//		assertEquals("C", retv);
//	}
//
//	@Test
//	public void encryptCharTest2() {
//		String retv = pGen.encryptChar("5");
//		assertEquals("^", retv);
//	}
//
//	@Test
//	public void encryptCharTest3() {
//		String retv = pGen.encryptChar("&");
//		assertEquals("6", retv);
//	}
//
//	@Test
//	public void encryptCharTest4() {
//		String retv = pGen.encryptChar("&");
//		assertEquals("6", retv);
//	}
//
//	@Test
//	public void encryptTextTest1() {
//		String retv = pGen.encryptText("JAVA");
//		assertEquals("YPSP", retv);
//	}
//
//	@Test
//	public void encryptTextTest2() {
//		String retv = pGen.encryptText("Hello");
//		assertEquals("Einnd", retv);
//	}
//
//	@Test
//	public void encryptTextTest3() {
//		String retv = pGen.encryptText("205");
//		assertEquals("#!^", retv);
//	}
//
//	@Test
//	public void encryptTextTest4() {
//		String retv = pGen.encryptText("#$@");
//		assertEquals("231", retv);
//	}
//
//	@Test
//	public void encryptTextTest5() {
//		String retv = pGen.encryptText("di%32f");
//		assertEquals("ga4$#u", retv);
//	}
//
//	@Test
//	public void decryptTextTest1() {
//		String retv = pGen.decryptText("rcvgw");
//		assertEquals("study", retv);
//	}
//
//	@Test
//	public void decryptTextTest2() {
//		String retv = pGen.decryptText("OwXprrtdkg");
//		assertEquals("MyPassword", retv);
//	}
//
//	@Test
//	public void decryptTextTest3() {
//		String retv = pGen.decryptText("ciqe@!@");
//		assertEquals("tech101", retv);
//	}
//
//	private void checkIfInValidNums(String retv,int count) {
//		if(retv.length() != count) {
//			fail("Numbers count mismatched");
//			return;
//		}
//
//		for (char s : retv.toCharArray()) {
//			if (!pGen.numbers.contains(s+"")) {
//				fail(s + " is unexpected number");
//			}
//		}
//
//	}
//
//	private void checkIfInValidChars(String retv,int count) {
//		if(retv.length() != count) {
//			fail("Uppercase letters count mismatched");
//			return;
//		}
//
//		for (char s : retv.toCharArray()) {
//			if (!pGen.specialChars.contains(s+"")) {
//				fail(s + " is unexpected char");
//			}
//		}
//
//	}
//
//	private void checkIfInValidUpper(String retv,int count) {
//		if(retv.length() != count) {
//			fail("Uppercase letters count mismatched");
//			return;
//		}
//
//		for (char s : retv.toCharArray()) {
//			if (!pGen.upperCaseLetters.contains(s+"")) {
//				fail(s + " is unexpected uppercase letter");
//			}
//		}
//
//	}
//
//	private void checkIfInValidLower(String retv,int count) {
//		if(retv.length() != count) {
//			fail("Lowercase letters count mismatched");
//			return;
//		}
//
//		for (char s : retv.toCharArray()) {
//			if (!pGen.lowerCaseLetters.contains(s+"")) {
//				fail(s + " is unexpected lowercase letter");
//			}
//		}
//
//	}
//
//}
