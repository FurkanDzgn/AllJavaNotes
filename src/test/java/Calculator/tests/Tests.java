package Calculator.tests;
import static org.junit.Assert.*;

import java.util.ArrayList;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import Calculations.Addition;
//import Calculations.Division;
//import Calculations.CalculatorTest;
//import Calculations.Multiplication;
//import Calculations.Question;
//import Calculations.RandomNumber;
//import Calculations.Range;
//import Calculations.Subtraction;
//
//
//
//public class Tests {
//
//	@Test
//	public void rangeTest() {
//		Range range = new Range(10, 50);
//		assertEquals(10, range.getMin());
//		assertEquals(50, range.getMax());
//	}
//
//	@Test
//	public void randomNumberTest1() {
//		Range range = new Range(10, 50);
//		int ran = RandomNumber.getRandomInteger(range);
//		assertTrue(ran >= range.getMin() );
//		assertTrue(ran <= range.getMax() );
//	}
//
//	@Test
//	public void randomNumberTest2() {
//		int ran = RandomNumber.getRandomInteger(10);
//		assertTrue(ran >= 1 );
//		assertTrue(ran <= 10 );
//	}
//
//	@Test
//	public void testAdd1() {
//		Question q = new Addition(new Range(10,100));
//		q.calc();
//		int result = q.getAnswer();
//		int expected = q.getFirstOperand() + q.getSecondOperand();
//		assertEquals(expected, result);
//	}
//
//	@Test
//	public void testAdd2() {
//		Question q = new Addition(new Range(10,100));
//		String result = q.toString();
//		String expected= q.getFirstOperand() +  "+" +  q.getSecondOperand()+"=";
//		assertEquals(expected, result);
//		q.calc();
//		result = q.toString();
//		expected= q.getFirstOperand() +  "+" +  q.getSecondOperand() +"=" + q.getAnswer();
//		assertEquals(expected, result);
//
//	}
//
//
//	@Test
//	public void testSub1() {
//		Question q = new Subtraction(new Range(10,100));
//		q.calc();
//		int result = q.getAnswer();
//		int expected = q.getFirstOperand() - q.getSecondOperand();
//		assertEquals(expected, result);
//	}
//
//	@Test
//	public void testSub2() {
//		Question q = new Subtraction(new Range(10,100));
//		String result = q.toString();
//		String expected= q.getFirstOperand() +  "-" +  q.getSecondOperand()+"=";
//		assertEquals(expected, result);
//		q.calc();
//		result = q.toString();
//		expected= q.getFirstOperand() +  "-" +  q.getSecondOperand() +"=" + q.getAnswer();
//		assertEquals(expected, result);
//	}
//
//	@Test
//	public void testSub3() {
//		Question q = null;
//		for(int i = 0; i < 1000; i++){
//			 q = new Subtraction(new Range(1,1000));
//			 q.calc();
//			 boolean r = q.getAnswer() >= 0;
//			 assertTrue(r);
//		}
//	}
//
//
//	@Test
//	public void testMul1() {
//		Question q = new Multiplication(new Range(10,100));
//		q.calc();
//		int result = q.getAnswer();
//		int expected = q.getFirstOperand() * q.getSecondOperand();
//		assertEquals(expected, result);
//	}
//
//	@Test
//	public void testMul2() {
//		Question q = new Multiplication(new Range(10,100));
//		String result = q.toString();
//		String expected= q.getFirstOperand() +  "*" +  q.getSecondOperand()+"=";
//		assertEquals(expected, result);
//		q.calc();
//		result = q.toString();
//		expected= q.getFirstOperand() +  "*" +  q.getSecondOperand() +"=" + q.getAnswer();
//		assertEquals(expected, result);
//	}
//
//	@Test
//	public void testDiv1() {
//		Question q = new Division(new Range(10,100));
//		q.calc();
//		int result = q.getAnswer();
//		int expected = q.getFirstOperand() / q.getSecondOperand();
//		assertEquals(expected, result);
//	}
//
//	@Test
//	public void testDiv2() {
//		Question q = new Division(new Range(10,100));
//		String result = q.toString();
//		String expected= q.getFirstOperand() +  "/" +  q.getSecondOperand()+"=";
//		assertEquals(expected, result);
//		q.calc();
//		result = q.toString();
//		expected= q.getFirstOperand() +  "/" +  q.getSecondOperand() +"=" + q.getAnswer();
//		assertEquals(expected, result);
//	}
//
//	@Test
//	public void testDiv3() {
//		Question q = null;
//		for(int i = 0; i < 1000; i++){
//			 q = new Division(new Range(10,1000));
//			 q.calc();
//			 boolean r = q.getAnswer() > 0;
//			 assertTrue(r);
//		}
//	}
//
//	@Test
//	public void testRand1() {
//		ArrayList<String> addList1 = new ArrayList<>();
//		ArrayList<String> addList2 = new ArrayList<>();
//		for(int i = 1; i <= 100; i++){
//			Addition a = new Addition(new Range(1,1000));
//			a.calc();
//			addList1.add(a.toString());
//		}
//
//		for(int i = 1; i <= 100; i++){
//			Addition a = new Addition(new Range(1,1000));
//			a.calc();
//			addList2.add(a.toString());
//		}
//
//		assertNotEquals(addList1, addList2);
//	}
//
//	@Test
//	public void testRand2() {
//		ArrayList<String> addList1 = new ArrayList<>();
//		ArrayList<String> addList2 = new ArrayList<>();
//		for(int i = 1; i <= 100; i++){
//			Subtraction a = new Subtraction(new Range(1,1000));
//			a.calc();
//			addList1.add(a.toString());
//		}
//
//		for(int i = 1; i <= 100; i++){
//			Subtraction a = new Subtraction(new Range(1,1000));
//			a.calc();
//			addList2.add(a.toString());
//		}
//		assertNotEquals(addList1, addList2);
//	}
//
//
//	@Test
//	public void testRand3() {
//		ArrayList<String> addList1 = new ArrayList<>();
//		ArrayList<String> addList2 = new ArrayList<>();
//		for(int i = 1; i <= 100; i++){
//			Multiplication a = new Multiplication(new Range(1,1000));
//			a.calc();
//			addList1.add(a.toString());
//		}
//
//		for(int i = 1; i <= 100; i++){
//			Multiplication a = new Multiplication(new Range(1,1000));
//			a.calc();
//			addList2.add(a.toString());
//		}
//
//		assertNotEquals(addList1, addList2);
//	}
//
//	@Test
//	public void testRand4() {
//		ArrayList<String> addList1 = new ArrayList<>();
//		ArrayList<String> addList2 = new ArrayList<>();
//		for(int i = 1; i <= 100; i++){
//			Division a = new Division(new Range(1,1000));
//			a.calc();
//			addList1.add(a.toString());
//		}
//
//		for(int i = 1; i <= 100; i++){
//			Division a = new Division(new Range(1,1000));
//			a.calc();
//			addList2.add(a.toString());
//		}
//
//		assertNotEquals(addList1, addList2);
//	}
//
//
//
//}
