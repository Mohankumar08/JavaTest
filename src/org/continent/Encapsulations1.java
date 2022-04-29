package org.continent;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Encapsulations1 {

	public static void main(String[] args) {
		Encapsulatons e = new Encapsulatons();
		e.setName("Mohan");
		e.setId(12);
		e.setMobile(9876543211l);

		Encapsulatons e1 = new Encapsulatons();
		e1.setName("Mohan Kumar");
		e1.setId(13);
		e1.setMobile(9654454311l);

		List<Encapsulatons> li = new LinkedList<>();
		li.add(e);
		li.add(e1);

		for (Encapsulatons w : li) {
			System.out.println("Name: " + w.getName());
			System.out.println("Id: " + w.getId());
			System.out.println("Mobile: " + w.getMobile());

		}

		System.out.println("---------------------------------------------------------");

		Set<Encapsulatons> s = new LinkedHashSet<>();
		s.add(e);
		s.add(e1);

		for (Encapsulatons x : s) {
			System.out.println("Name: " + x.getName());
			System.out.println("Id: " + x.getId());
			System.out.println("Mobile: " + x.getMobile());
		}

		System.out.println("---------------------------------------------------------");

		// Map

		Map<String, Encapsulatons> m = new LinkedHashMap<>();
		m.put("Manager", e);
		m.put("Teamlead", e1);
		
		Set<Entry<String, Encapsulatons>> z = m.entrySet();
		
		for (Entry<String, Encapsulatons> d : z) {
			System.out.println(d.getKey());
			System.out.println("Name: " + d.getValue().getName());
			System.out.println("Id: " + d.getValue().getId());
			System.out.println("Mobile: " + d.getValue().getMobile());
		}
		}

	}

