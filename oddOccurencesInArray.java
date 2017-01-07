

import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class JavaTreeMapExample {
	
	public static void main(String[] args) {
		
		//Natural ordering of key Integer
		int[] a = {3,3,6,2,9,6,2,9,2};
		//int count = 0 ;
		int value = 0 ;
		int length = a.length ;
		Map integerMap = new TreeMap();
		//ArrayList l = (Arrays.asList(a));System.out.println(l);
		for(int i = 0 ; i<length ; i++)
		{
			
				
				//System.out.println(i);


				//System.out.println(l.get(i));
				Object count =(integerMap.containsKey(a[i]) ? integerMap.get(a[i]) : 0);
				int count1 = (int)count ;
				integerMap.put(a[i],count1 + 1);
				
			
		}

		
		//System.out.println(integerMap.toString());
Set set = integerMap.entrySet();
 
    // Get an iterator
    Iterator it = set.iterator();
 
    // Display elements
    while(it.hasNext()) {
      Map.Entry me = (Map.Entry)it.next();
	Object key = me.getKey();
      //System.out.print(key);
	Object value1 = me.getValue();
	 value = (int) value1;
      //System.out.println("Value is: "+ value);
	if(value%2 !=0){ System.out.println(key);}
    } 		
	}

}
