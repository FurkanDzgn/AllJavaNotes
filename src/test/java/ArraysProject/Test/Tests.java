// Copyright 2020 Techtorial LLC
package ArraysProject.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

//import Main.Main;

//public class Tests {
//
//	static Main method = new Main();
//	String[] array={ "a", "b", "c"};
//	String[] array1={"one", "two", "three", "four", "five"};
//	String[] array2={"tester", "developer", "scrum master", "tester2", "code", "in", "java", "language", "!"};
//	String[] array3={"2", "1", "4", "3", "6", "5", "7"};
//	String[] array4={"four", "flowers", "sun", "eleven", "cloud", "better", "git"};
//	String[] array5={"java", "little", "nine", "door", "and", "seven", "yard", "with", "laptop"};
//	String[] array6={"tiger", "zebra"};
//	String[] array7={"code"};
//
//	@Test
//	public void switchUsingArray(){
//
//		String [] expected = {"b", "a", "c"};
//		assertArrayEquals(expected, method.switchPairs(array));
//
//	}
//	@Test
//	public void switchUsingArray1(){
//		String [] expected2 = { "two","one", "four","three", "five"};
//		assertArrayEquals(expected2, method.switchPairs(array1));
//	}
//	@Test
//	public void switchUsingArray2(){
//		String [] expected3 = { "developer","tester",  "tester2","scrum master",  "in","code",  "language","java", "!"};
//		assertArrayEquals(expected3, method.switchPairs(array2));
//	}
//	@Test
//	public void switchUsingArray3(){
//		String [] expected4 = { "1","2",  "3","4",  "5","6", "7"};
//		assertArrayEquals(expected4, method.switchPairs(array3));
//	}
//	@Test
//	public void switchUsingArray4(){
//		String [] expected5 = {"flowers", "four", "eleven", "sun", "better", "cloud", "git"};
//		assertArrayEquals(expected5, method.switchPairs(array4));
//	}
//	@Test
//	public void switchUsingArray5(){
//		String [] expected6 = {"little", "java", "door", "nine", "seven", "and", "with", "yard", "laptop"};
//		assertArrayEquals(expected6, method.switchPairs(array5));
//	}
//	@Test
//	public void switchUsingArray6(){
//		String [] expected7 = {"zebra", "tiger"};
//		assertArrayEquals(expected7, method.switchPairs(array6));
//	}
//	@Test
//	public void switchUsingArray7(){
//		String [] expected8 = {"code"};
//		assertArrayEquals(expected8, method.switchPairs(array7));
//	}
//
//	@Test
//	public void outOfOrder(){
//		int [] pages={3,66,77,78,79,90,87};
//		assertEquals(87,method.outOfOrder(pages) );
//	}
//
//	@Test
//	public void outOfOrder2(){
//		int [] pages={3,66,2,78,79,90,87};
//		assertEquals(2,method.outOfOrder(pages) );
//	}
//	@Test
//	public void outOfOrder3(){
//		int [] pages={3,4,7,78,79,90,97};
//		assertEquals(-1,method.outOfOrder(pages) );
//	}
//	@Test
//	public void outOfOrder4(){
//		int [] pages={3,5,1};
//		assertEquals(1,method.outOfOrder(pages) );
//	}
//
//	@Test
//	public void testMaxNum1() {
//		int[] maxNum1={6,99,3,45,0,-234};
//		assertEquals(99,method.maxNum(maxNum1));
//	}
//	@Test
//	public void testMaxNum2() {
//		int[] maxNum2={-234,66,3,1,0,567,99};
//		assertEquals(567,method.maxNum(maxNum2));
//	}
//	@Test
//	public void testMaxNum3() {
//		int[] maxNum3={-1};
//		assertEquals(-1,method.maxNum(maxNum3));
//	}
//	@Test
//	public void testRemoveDuplicates1() {
//		int[] nums1={2,55,77,3,4,2};
//		int[] expected= {2,55,77,3,4};
//		assertArrayEquals(expected,method.removeDuplicates(nums1));
//	}
//	@Test
//	public void testRemoveDuplicates2() {
//		int[] nums2={-33,0,0,-33,5,1};
//		int[] expected2= {-33,0,5,1};
//		assertArrayEquals(expected2,method.removeDuplicates(nums2));
//	}
//	@Test
//	public void testRemoveDuplicates3() {
//		int[] nums3={5,7,1,99,5};
//		int[] expected3= {5,7,1,99};
//		assertArrayEquals(expected3,method.removeDuplicates(nums3));
//	}
//	@Test
//	public void testRemoveDuplicates4() {
//		int[] nums4={0,0};
//		int[] expected4= {0};
//		assertArrayEquals(expected4,method.removeDuplicates(nums4));
//	}
//	@Test
//	public void testcombineNumbers1() {
//		int[] nums1={0,0,0};
//		int expected1= 0;
//		assertEquals(expected1,method.combineNumbers(nums1));
//	}
//	@Test
//	public void testcombineNumbers2() {
//		int[] nums2={2,67,85,4};
//		int expected2= 267854;
//		assertEquals(expected2,method.combineNumbers(nums2));
//	}
//	@Test
//	public void testcombineNumbers3() {
//		int[] nums3={-1,2,67,85,4};
//		int expected3= 1267854;
//		assertEquals(expected3,method.combineNumbers(nums3));
//	}
//
//	private void assertArrayListEquals(ArrayList<String> expected, ArrayList<String> switchPairs) {
//		for (int i=0; i<expected.size(); i++) {
//			assertEquals(expected.get(i),switchPairs.get(i));
//		}
//
//	}
//
//	@Test
//	public void testArray1() {
//		int[] array= {1,2,3,4,5,6,7,8,9,10};
//		int expected = 25;
//		int result = method.sumOfOdds(array);
//		assertEquals(result,expected);
//	}
//
//
//	@Test
//	public void testArray2() {
//		int[] array= {2,3,4,5};
//		int expected = 8;
//		int result = method.sumOfOdds(array);
//		assertEquals(result,expected);
//	}
//
//
//	@Test
//	public void testArray3() {
//		int[] array= {-5,2,4,8,10,5};
//		int expected = 0;
//		int result = method.sumOfOdds(array);
//		assertEquals(result,expected);
//	}
//
//
//	@Test
//	public void testThreeAmigos1(){
//		int[] arr = {1,3,5,4,6};
//		assertTrue(method.threeAmigos(arr));
//	}
//
//	@Test
//	public void testThreeAmigos2(){
//		int[] arr = {100,333,500,4,6,1};
//		assertTrue(method.threeAmigos(arr));
//	}
//
//	@Test
//	public void testThreeAmigos3(){
//		int[] arr = {100,333,500,41,6,1};
//		assertFalse(method.threeAmigos(arr));
//	}
//
//	@Test
//	public void contains12Test1(){
//		int[] arr = {25,13,1,22};
//		assertFalse(method.contains12(arr));
//	}
//
//	@Test
//	public void contains12Test2(){
//		int[] arr = {25,13,1,2};
//		assertTrue(method.contains12(arr));
//	}
//
//	@Test
//	public void contains12Test3(){
//		int[] arr = {1,13,11,2};
//		assertTrue(method.contains12(arr));
//	}
//
//	@Test
//	public void contains12Test4(){
//		int[] arr = {2,2,1,1};
//		assertFalse(method.contains12(arr));
//	}
//
//	@Test
//	public void contains12Test5(){
//		int[] arr = {133,3,56,0};
//		assertFalse(method.contains12(arr));
//	}
//
//	@Test
//	public void make100With2Test1(){
//		int [] array = {7, 7, 1, 1, 7};
//	    assertFalse(method.make100With2(array));
//	}
//
//	@Test
//	public void make100With2Test2(){
//		int [] array = {100, 0, 1};
//	    assertTrue(method.make100With2(array));
//	}
//
//	@Test
//	public void make100With2Test3(){
//		int [] array = {12,34,88};
//	    assertTrue(method.make100With2(array));
//	}
//
//	@Test
//	public void make100With2Test4(){
//		int [] array = {49, 50, 65, 23 ,1};
//	    assertFalse(method.make100With2(array));
//	}
//
//	@Test
//	public void make100With2Test5(){
//		int [] array = {1};
//	    assertFalse(method.make100With2(array));
//	}
//
//	@Test
//	public void make100With2Test6(){
//		int [] array = {100};
//	    assertFalse(method.make100With2(array));
//	}
//

//}
