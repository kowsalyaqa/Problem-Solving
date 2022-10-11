package tests;

import java.util.LinkedHashMap;
import java.util.Map;

public class Anagaram {

	//Approach-1
	public boolean test1(String s, String t) {
		boolean flag=false;
		if(s.length()==t.length()) {
		Map<Character, Integer> map1 = getCharCount(s);
		Map<Character, Integer> map2 = getCharCount(t);
		if(map1.equals(map2)) return flag=true;
		else return flag;
		}else return false;
	}
	
	public Map<Character,Integer> getCharCount(String s){
		Map<Character, Integer> map=new LinkedHashMap<>();
		char[] charArray = s.toCharArray();
		for (char e: charArray) {
			if(map.containsKey(e)) map.put(e,map.get(e)+1);
			else map.put(e,1);
		}
		return map;
	}
	
	public static void main(String[] args) {
		Anagaram a=new Anagaram();
		System.out.println(a.test1("teat","eatt"));
	}
}
