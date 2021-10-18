package CountOccuranceOfEachWord;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CountOccOfEachWord {
	
	private Map<String,Integer> CountOccuranceOfEachWord(String s) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		int count=0;
		String []strArr=s.split(" ");
		if(!s.isEmpty()) {
			
			for(int i=0;i<strArr.length;i++) {
				if(!strArr[i].isBlank()) {
				if(!map.containsKey(strArr[i])) {
					count++;
					map.put(strArr[i], count);
				}else {
					count=map.get(strArr[i]);
					count=count+1;
					map.put(strArr[i], count);
				}
				
				count=0;
				}
			}
			
		}
		return map;
	}
	
	@Test
	public void test1() {
		System.out.println(CountOccuranceOfEachWord("Hello Java Friends Java"));
	}
	
	@Test
	public void test2() {
		System.out.println(CountOccuranceOfEachWord("Hello Java Friends "));
	}
	@Test
	public void test3() {
		System.out.println(CountOccuranceOfEachWord("Hello Java  Friends Java"));
	}

	

}
