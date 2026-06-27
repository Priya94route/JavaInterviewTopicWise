package Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	HashMap<Integer,String> hm= new HashMap<>();
	hm.put(-1, "Priya");
	hm.put(4, "Priya");
	hm.put(12, "Shreya");
	hm.put(9, "Priya");
	hm.put(0, "Priya");
	System.out.println(hm);
	TreeMap<Integer,String> tm= new TreeMap<>(Collections.reverseOrder());
	tm.putAll(hm);
	System.out.println(tm);
	//
	if(hm.containsKey(4)) System.out.println("hm get"+hm.get(4));
	//if(hm.containsValue("Priya")) System.out.println(hm.get());
	
	for(Map.Entry<Integer,String> hns:hm.entrySet())
	{
		if(hns.getValue().equals("Priya"))
			System.out.println(hns.getKey() +hns.getValue());
		hm.remove(-1);
		
		
		
	}
	
	
	
	
	
	

	}

}
