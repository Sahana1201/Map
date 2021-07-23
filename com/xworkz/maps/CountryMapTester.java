package com.xworkz.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMapTester {

	public static void main(String[] args) {

		Map<String, Long> countryAndPopulationMap = new HashMap<String, Long>();
		countryAndPopulationMap.put("India", 136l);
		countryAndPopulationMap.put("China", 139l);
		countryAndPopulationMap.put("United States", 32l);
		countryAndPopulationMap.put("Indonesia", 21l);
		countryAndPopulationMap.put("Pakisthan", 27l);

		System.out.println(countryAndPopulationMap.size());
		System.out.println("#########################################");
		System.out.println(countryAndPopulationMap.containsKey("India"));
		System.out.println("#########################################");
		System.out.println(countryAndPopulationMap.containsValue(22l));
		System.out.println("#########################################");

		Set<String> keyset = countryAndPopulationMap.keySet();
		Collection<Long> values = countryAndPopulationMap.values();

		System.out.println("Population printing In Crores");
		Iterator<Long> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			Long longs = itrValue.next();
			System.out.println(longs);
		}
		System.out.println("#########################################");
		System.out.println("Country printing");
		Iterator<String> itrvalue = keyset.iterator();
		while (itrvalue.hasNext()) {
			String stringvalue = itrvalue.next();
			System.out.println(stringvalue);
		}
		System.out.println("#########################################");
		System.out.println("Country-Population printing");
		Iterator<String> itr = keyset.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			Long value = countryAndPopulationMap.get(string);
			System.out.println(string + " " + value);
		}
		System.out.println("#########################################");
		countryAndPopulationMap.remove("India");
		System.out.println(countryAndPopulationMap.size());
	}

}
