package concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {

		ConcurrentMap<Character,LongAdder> ocurances=new ConcurrentHashMap<>();
		String str="HELLO";
		for(char character:str.toCharArray())
		{
			LongAdder longAdder=ocurances.get(character);
			if(longAdder==null)
			{
				longAdder=new LongAdder();
			}
			longAdder.increment();
			ocurances.put(character, longAdder);
		}
		System.out.println(ocurances);
	}

}
