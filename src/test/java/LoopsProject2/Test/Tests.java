package LoopsProject2.Test;

//import static org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//
//import Main.Loops;
//
//public class Tests {
//
//	@Test
//	public void printOdd() {
//		Loops loops=new Loops();
//		String num = "1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,";
//		assertEquals(num, loops.getOddNumbers());
//
//	}
//
//	@Test
//	public void testReverse1() {
//		Loops loops=new Loops();
//		String word = "elbaT";
//		assertEquals(word, loops.reverse("Table"));
//	}
//
//	@Test
//	public void testReverse2() {
//		Loops loops=new Loops();
//		String word = "12345";
//		assertEquals(word, loops.reverse("54321 "));
//	}
//
//	@Test
//	public void testReverse3() {
//		Loops loops=new Loops();
//		String word = "!boJ maerD";
//		assertEquals(word, loops.reverse("Dream Job! "));
//	}
//
//	@Test
//	public void testCanDivide1() {
//		Loops loops=new Loops();
//		int sum = 150;
//		assertEquals(sum, loops.canDivide3And5(10, 60));
//	}
//
//	@Test
//	public void testCanDivide2() {
//		Loops loops=new Loops();
//		int sum = 225;
//		assertEquals(sum, loops.canDivide3And5(60, 100));
//	}
//
//	@Test
//	public void testCanDivide3() {
//		Loops loops=new Loops();
//		int sum = 0;
//		assertEquals(sum, loops.canDivide3And5(-35, 35));
//	}
//
//	@Test
//	public void testSeparateWords1() {
//		Loops loops=new Loops();
//		String separated = "For Loop Was Very Easy";
//		assertEquals(separated, loops.separateWords("ForLoopWasVeryEasy"));
//	}
//
//	@Test
//	public void testSeparateWords2() {
//		Loops loops=new Loops();
//		String separated = "No Pain No Gain";
//		assertEquals(separated, loops.separateWords("NoPainNoGain"));
//	}
//
//	@Test
//	public void testSeparateWords3() {
//		Loops loops=new Loops();
//		String separated = "Programming Is Demanded In Market";
//		assertEquals(separated, loops.separateWords("ProgrammingIsDemandedInMarket"));
//	}
//
//	@Test
//	public void testCountLetter1() {
//		Loops loops=new Loops();
//		String separated = "Programming Is Demanded In Market";
//		assertEquals(separated, loops.separateWords("ProgrammingIsDemandedInMarket"));
//	}
//
//	@Test
//	public void testCountLetter2() {
//		Loops loops=new Loops();
//		String separated = "Programming Is Demanded In Market";
//		assertEquals(separated, loops.separateWords("ProgrammingIsDemandedInMarket"));
//	}
//
//	@Test
//	public void testGetUniqueLetters1() {
//		Loops loops=new Loops();
//		String separated = "abc";
//		assertEquals(separated, loops.getUniqueLetters("aabbcc"));
//	}
//
//
//	@Test
//	public void testGetUniqueLetters2() {
//		Loops loops=new Loops();
//		String separated = "hapy";
//		assertEquals(separated, loops.getUniqueLetters("happy"));
//	}
//
//	@Test
//	public void testGetUniqueLetters3() {
//		Loops loops=new Loops();
//		String separated = "progame";
//		assertEquals(separated, loops.getUniqueLetters("programmer"));
//	}
//
//	@Test
//	public void testGetUniqueLetters4() {
//		Loops loops=new Loops();
//		String separated = "maxiu";
//		assertEquals(separated, loops.getUniqueLetters("maximum"));
//	}
//
//	@Test
//	public void testGetUniqueLetters5() {
//		Loops loops=new Loops();
//		String separated = "i am hpy";
//		assertEquals(separated, loops.getUniqueLetters("i am happy"));
//	}
//
//	@Test
//	public void testGetUniqueLetters6() {
//		Loops loops=new Loops();
//		String separated = "i ned cof";
//		assertEquals(separated, loops.getUniqueLetters(" i need coffee"));
//	}
//
//
//}
