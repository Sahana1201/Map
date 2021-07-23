package com.xworkz.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AdharNumberMobileNumber {

	public static void main(String[] args) {

		Map<Long, Long> adharMobile = new HashMap<Long, Long>();

		adharMobile.put(324780897787l, 7539512489l);
		adharMobile.put(123589647852l, 8965471253l);
		adharMobile.put(524385895423l, 9995463541l);
		adharMobile.put(524367888423l, 9895463541l);
		adharMobile.put(674367895423l, 8895463541l);
		adharMobile.put(784367895423l, 9789546354l);

		System.out.println(adharMobile.size());
		System.out.println("#########################################");
		System.out.println(adharMobile.containsKey(324780897787l));
		System.out.println("#########################################");
		System.out.println(adharMobile.containsValue(9995463541l));
		System.out.println("#########################################");

		Set<Long> keyset = adharMobile.keySet();
		Collection<Long> values = adharMobile.values();
		System.out.println("MobileNumber printing");
		Iterator<Long> itrValue = values.iterator();
		while (itrValue.hasNext()) {
			long mobile = itrValue.next();
			System.out.println(mobile);
		}
		System.out.println("#########################################");
		System.out.println("Adhar Number printing");
		Iterator<Long> itrvalue = keyset.iterator();
		while (itrvalue.hasNext()) {
			Long adhar = itrvalue.next();
			System.out.println(adhar);
		}
		System.out.println("#########################################");
		System.out.println("AdharNumber-MobileNumber printing");
		Iterator<Long> itr = keyset.iterator();
		while (itr.hasNext()) {
			Long string = itr.next();
			Long value = adharMobile.get(string);
			System.out.println(string + " " + value);
		}
		System.out.println("#########################################");
		adharMobile.remove(324780897787l);
		System.out.println(adharMobile.size());

	}

}
