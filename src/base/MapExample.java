package base;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap();
		
		// To add the Values to the Map
				m.put(10, "java");
				m.put(20, "sql");
				m.put(30, "python");
				m.put(40, "selenium");
				m.put(50, "java");
				m.put(20, "csharp");

				System.out.println(m); // {10=java, 20=csharp, 30=python, 40=selenium, 50=java}

				// used to find out the size of map
				int size = m.size();
				System.out.println(size); // 5

				// displaying the corresponding keys values
				String string = m.get(30);
				System.out.println(string); // python

				// remove the values from map
				m.remove(40);
				System.out.println(m); // {10=java, 20=csharp, 30=python, 50=java}

				// used to check the particular key is present or out
				boolean containsKey = m.containsKey(30);
				System.out.println(containsKey); // true

				// used to check the particular value is present or out
				boolean containsValue = m.containsValue("sql");
				System.out.println(containsValue); // false

				// displaying the values only and its return type is collection
				Collection<String> values = m.values();
				System.out.println(values); // [java, csharp, python, java]

				// display the keys only and its return type is set.
				Set<Integer> keySet = m.keySet();
				System.out.println(keySet); // [10, 20, 30, 50]

				// for iterating the map and its return type is set<Entry<>>
				Set<Entry<Integer, String>> entrySet = m.entrySet();
				System.out.println(entrySet); // [10=java, 20=csharp, 30=python, 50=java]

				// To Iterate the map
				System.out.println("For Each loop");

				for (Entry<Integer, String> x : entrySet) {

					System.out.println(x);

				}

				System.out.println(" ");

				for (Entry<Integer, String> y : entrySet) {

					System.out.println(y.getKey());
					System.out.println(y.getValue());

				}

	}

}
