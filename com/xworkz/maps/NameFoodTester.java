package com.xworkz.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameFoodTester {

	public static void main(String[] args) {

		Map<String, String> nameFood = new HashMap<String, String>();

		nameFood.put("Sahana", "Panipuri");
		nameFood.put("Teju", "Masalapuri");
		nameFood.put("Harsha", "Sev-puri");
		nameFood.put("Anusha", "Jamoon");
		nameFood.put("Rakshitha", "Gobi Manchuri");
		nameFood.put("Prajwal", "French-Fries");

		System.out.println(nameFood.size());
		System.out.println("#########################################");
		System.out.println(nameFood.containsKey("Sahana"));
		System.out.println("#########################################");
		System.out.println(nameFood.containsValue("French-Fries"));
		System.out.println("#########################################");

		Set<String> keyset = nameFood.keySet();
		Collection<String> values = nameFood.values();

		System.out.println("Food printing");
		Iterator<String> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			String str = itrValue.next();
			System.out.println(str);
		}
		System.out.println("#########################################");
		System.out.println("Name printing");
		Iterator<String> itrvalue = keyset.iterator();
		while (itrvalue.hasNext()) {
			String stringvalue = itrvalue.next();
			System.out.println(stringvalue);
		}
		System.out.println("#########################################");
		System.out.println("Name & Food printing");
		Iterator<String> itr = keyset.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			String value = nameFood.get(string);
			System.out.println(string + " " + value);
		}
		System.out.println("#########################################");
		nameFood.remove("Harsha");
		System.out.println(nameFood.size());
	}

}
