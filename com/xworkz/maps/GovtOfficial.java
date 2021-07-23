package com.xworkz.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovtOfficial {

	public static void main(String[] args) {

		Map<String, Double> govtOfficial = new HashMap<String, Double>();
		govtOfficial.put("Governors", 350000d);
		govtOfficial.put("President", 500000d);
		govtOfficial.put("Vice President", 400000d);
		govtOfficial.put("Prime Minister", 280000d);
		govtOfficial.put("Cabinet Secretary", 6520000d);

		System.out.println(govtOfficial.size());
		System.out.println("#########################################");
		System.out.println(govtOfficial.containsKey("President"));
		System.out.println("#########################################");
		System.out.println(govtOfficial.containsValue(6520000d));
		System.out.println("#########################################");

		Set<String> keyset = govtOfficial.keySet();
		Collection<Double> values = govtOfficial.values();

		System.out.println("Salary printing");
		Iterator<Double> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			Double salary = itrValue.next();
			System.out.println(salary);
		}

		System.out.println("#########################################");
		System.out.println("Govt Official Post");
		Iterator<String> itrvalue = keyset.iterator();
		while (itrvalue.hasNext()) {
			String stringvalue = itrvalue.next();
			System.out.println(stringvalue);
		}
		System.out.println("#########################################");
		System.out.println("Govt Official and Salary");
		Iterator<String> itr = keyset.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			Double value = govtOfficial.get(string);
			System.out.println(string + " " + value);
		}
		System.out.println("#########################################");
		govtOfficial.remove("Prime Minister");
		System.out.println(govtOfficial.size());
	}

}
