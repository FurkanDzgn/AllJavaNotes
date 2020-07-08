package JavaProject.Test;

//import org.junit.Assert;
//import org.junit.Test;
//
//import Main.Methods;
//
//public class TestMethods {
//
//	@Test
//	public void testMultiplyOrSum1() {
//		Methods m = new Methods();
//		int actual = m.multiplyOrSum(5, -5);
//		Assert.assertEquals(0, actual);
//	}
//
//	@Test
//	public void testMultiplyOrSum2() {
//		Methods m = new Methods();
//		int actual = m.multiplyOrSum(6,4);
//		Assert.assertEquals(10, actual);
//	}
//
//	@Test
//	public void testMultiplyOrSum3() {
//		Methods m = new Methods();
//		int actual = m.multiplyOrSum(12,12);
//		Assert.assertEquals(144, actual);
//	}
//
//	@Test
//	public void testGetBalance1() {
//		Methods m = new Methods();
//		double actual = m.getBalance(1000, 200, 500);
//		Assert.assertEquals(1300.0, actual,2);
//	}
//
//	@Test
//	public void testGetBalance2() {
//		Methods m = new Methods();
//		double actual = m.getBalance(50, 6, 0);
//		Assert.assertEquals(44.0, actual,2);
//	}
//
//	@Test
//	public void testGetBalance3() {
//		Methods m = new Methods();
//		double actual = m.getBalance(155, 22, 80);
//		Assert.assertEquals(213.0, actual,2);
//	}
//
//	@Test
//	public void testReplaceChars1() {
//		Methods m = new Methods();
//		String actual = m.replaceChars("Java");
//		Assert.assertEquals("aavJ", actual);
//	}
//
//	@Test
//	public void testReplaceChars2() {
//		Methods m = new Methods();
//		String actual = m.replaceChars("Text");
//		Assert.assertEquals("texT", actual);
//	}
//
//	@Test
//	public void testReplaceChars3() {
//		Methods m = new Methods();
//		String actual = m.replaceChars("56");
//		Assert.assertEquals("65", actual);
//	}
//
//	@Test
//	public void testReplaceChars4() {
//		Methods m = new Methods();
//		String actual = m.replaceChars(" study ");
//		Assert.assertEquals(" study ", actual);
//	}
//
//	@Test
//	public void testContainsWord1() {
//		Methods m = new Methods();
//		boolean actual = m.containsWord("hello world!","world!");
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testContainsWord2() {
//		Methods m = new Methods();
//		boolean actual = m.containsWord("hello world!","world ");
//		Assert.assertEquals(false, actual);
//	}
//
//	@Test
//	public void testContainsWord3() {
//		Methods m = new Methods();
//		boolean actual = m.containsWord("Playing table tennis.","le te");
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testContainsWord4() {
//		Methods m = new Methods();
//		boolean actual = m.containsWord("Playing table tennis."," le te ");
//		Assert.assertEquals(false, actual);
//	}
//
//	@Test
//	public void testPrime1() {
//		Methods m = new Methods();
//		boolean actual = m.isPrime(5);
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testPrime2() {
//		Methods m = new Methods();
//		boolean actual = m.isPrime(-1);
//		Assert.assertEquals(false, actual);
//	}
//
//	@Test
//	public void testPrime3() {
//		Methods m = new Methods();
//		boolean actual = m.isPrime(2);
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testPrime4() {
//		Methods m = new Methods();
//		boolean actual = m.isPrime(123);
//		Assert.assertEquals(false, actual);
//	}
//
//	@Test
//	public void testPrime5() {
//		Methods m = new Methods();
//		boolean actual = m.isPrime(19);
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testPrime6() {
//		Methods m = new Methods();
//		boolean actual = m.isPrime(31);
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testPrime7() {
//		Methods m = new Methods();
//		boolean actual = m.isPrime(7);
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testSameTwoChars1() {
//		Methods m = new Methods();
//		boolean actual = m.sameTwoChars("ff");
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testSameTwoChars2() {
//		Methods m = new Methods();
//		boolean actual = m.sameTwoChars("tt");
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testSameTwoChars3() {
//		Methods m = new Methods();
//		boolean actual = m.sameTwoChars("Rr");
//		Assert.assertEquals(true, actual);
//	}
//
//	@Test
//	public void testSameTwoChars4() {
//		Methods m = new Methods();
//		boolean actual = m.sameTwoChars("{}");
//		Assert.assertEquals(false, actual);
//	}
//
//	@Test
//	public void testSameTwoChars5() {
//		Methods m = new Methods();
//		boolean actual = m.sameTwoChars("ab");
//		Assert.assertEquals(false, actual);
//	}
//
//}
