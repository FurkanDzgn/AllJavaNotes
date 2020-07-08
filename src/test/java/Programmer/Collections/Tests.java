package Programmer.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

	 @Test
	    public void countLettersTest() {
	        Assert.assertEquals(map, PracticeMap.countLetters(word));
	    }

	    @Test
	    public void countLettersTest1() {
	        Assert.assertEquals(map1, PracticeMap.countLetters(word1));
	    }

	    @Test
	    public void countLettersTest2() {
	        Assert.assertEquals(map2, PracticeMap.countLetters(word2));
	    }

	    @Test
	    public void countLettersTest3() {
	        Assert.assertEquals(map3, PracticeMap.countLetters(word5));
	    }

	    @Test
	    public void uniqeLettersTest() {
	        Assert.assertEquals(unique5, PracticeMap.uniqueLetters(word5));
	    }

	    @Test
	    public void uniqeLettersTest2() {
	        Assert.assertEquals(unique2, PracticeMap.uniqueLetters(word2));
	    }

	    @Test
	    public void uniqeLettersTest3() {
	        Assert.assertEquals(unique3, PracticeMap.uniqueLetters(word3));
	    }

	    @Test
	    public void complicatedDataTypesTest() {
	        Assert.assertEquals(listOfMaps, PracticeMap.complicatedDataTypes(word6));
	    }

	    @Test
	    public void complicatedDataTypesTest1() {
	        Assert.assertEquals(listOfMaps1, PracticeMap.complicatedDataTypes(word3));
	    }

	    @Test
	    public void complicatedDataTypesTest2() {
	        Assert.assertEquals(listOfMaps3, PracticeMap.complicatedDataTypes(word5));
	    }

	    static List<Character>                 unique      = new ArrayList();
	    static List<Character>                 unique2     = new ArrayList();
	    static List<Character>                 unique3     = Arrays.asList('A', 'E', 'P', 'T', 'c', 'f', 'k', 'm');
	    static List<Character>                 unique5     = Arrays.asList('6');

	    private static String                  word5       = "89756521584598745312789545132154897";
	    private static String                  word3       = "Everybody living must be willing to keep the peace on our planet. That's how every body thought on the Planet of Apes";
	    private static String                  word6       = "Hello mommy. I love you. good job";
	    private static String                  word        = "My name is John Wick, I came from future";
	    private static String                  word1       = "This is funny???!!!!****##@!((*(&()<<<>>>>,,,....task";
	    private static String                  word2       = "";

	    private static Map<Character, Integer> map2        = new HashMap();
	    private static Map<Character, Integer> map1        = new HashMap() {

	                                                           {
	                                                               put('a', 1);
	                                                               put('f', 1);
	                                                               put('h', 1);
	                                                               put('k', 1);
	                                                               put('n', 2);
	                                                               put('s', 3);
	                                                               put('T', 1);
	                                                               put('t', 1);
	                                                               put('u', 1);
	                                                               put('y', 1);
	                                                               put('i', 2);
	                                                           }
	                                                       };
	    private static Map<Character, Integer> map         = new HashMap() {

	                                                           {
	                                                               put('a', 2);
	                                                               put('c', 2);
	                                                               put('e', 3);
	                                                               put('f', 2);
	                                                               put('h', 1);
	                                                               put('i', 2);
	                                                               put('I', 1);
	                                                               put('J', 1);
	                                                               put('k', 1);
	                                                               put('M', 1);
	                                                               put('m', 3);
	                                                               put('n', 2);
	                                                               put('o', 2);
	                                                               put('r', 2);
	                                                               put('s', 1);
	                                                               put('t', 1);
	                                                               put('u', 2);
	                                                               put('W', 1);
	                                                               put('y', 1);
	                                                           }
	                                                       };

	    private static Map<Character, Integer> map3        = new HashMap() {

	                                                           {
	                                                               put('1', 4);
	                                                               put('2', 3);
	                                                               put('3', 2);
	                                                               put('4', 4);
	                                                               put('5', 8);
	                                                               put('6', 1);
	                                                               put('7', 4);
	                                                               put('8', 5);
	                                                               put('9', 4);
	                                                           }
	                                                       };
	    private static Map<String, Integer>    mapForList  = new HashMap() {

	                                                           {
	                                                               put("Hello", 0);
	                                                               put("mommy", 1);
	                                                           }
	                                                       };
	    private static Map<String, Integer>    mapForList1 = new HashMap() {

	                                                           {
	                                                               put("I", 0);
	                                                               put("love", 1);
	                                                               put("you", 2);
	                                                           }
	                                                       };
	    private static Map<String, Integer>    mapForList2 = new HashMap() {

	                                                           {
	                                                               put("good", 0);
	                                                               put("job", 1);
	                                                           }
	                                                       };

	    private static Map<String, Integer>    mapForList3 = new HashMap() {

	                                                           {
	                                                               put("the", 7);
	                                                               put("living", 1);
	                                                               put("be", 3);
	                                                               put("willing", 4);
	                                                               put("planet", 11);
	                                                               put("keep", 6);
	                                                               put("peace", 8);
	                                                               put("must", 2);
	                                                               put("to", 5);
	                                                               put("Everybody", 0);
	                                                               put("our", 10);
	                                                               put("on", 9);
	                                                           }
	                                                       };
	    private static Map<String, Integer>    mapForList4 = new HashMap() {

	                                                           {
	                                                               put("the", 6);
	                                                               put("how", 1);
	                                                               put("Apes", 9);
	                                                               put("thought", 4);
	                                                               put("of", 8);
	                                                               put("Planet", 7);
	                                                               put("body", 3);
	                                                               put("That's", 0);
	                                                               put("every", 2);
	                                                               put("on", 5);
	                                                           }
	                                                       };
	    private static Map<String, Integer>    mapForList5 = new HashMap() {

	                                                           {
	                                                               put("89756521584598745312789545132154897", 0);
	                                                           }
	                                                       };

	    static List<Map<String, Integer>>      listOfMaps  = new ArrayList() {

	                                                           {
	                                                               add(mapForList);
	                                                               add(mapForList1);
	                                                               add(mapForList2);
	                                                           }
	                                                       };
	    static List<Map<String, Integer>>      listOfMaps1 = new ArrayList() {

	                                                           {
	                                                               add(mapForList3);
	                                                               add(mapForList4);
	                                                           }
	                                                       };

	    static List<Map<String, Integer>>      listOfMaps3 = new ArrayList() {

	                                                           {
	                                                               add(mapForList5);
	                                                           }
	                                                       };
}
