package com.capgemini.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>  StoreList = new HashMap<Integer,String>();

		StoreList.put(12, "Apples");
		StoreList.put(2, "Flour");
		StoreList.put(3, "pulses");
		StoreList.put(4, "oil");

		System.out.println("HashMap values=" + StoreList);
		// set of keys from the above HashMap
		Set<Integer> StoreListKeySet = StoreList.keySet();
		System.out.println("key values of above HashMap=" + StoreListKeySet);

		// set of values from the above HashMap
		Collection<String> StoreListValueSet = StoreList.values();
		System.out.println("values if above HashMap =" + StoreListValueSet);

		// keys,values from above HashMap using entry set()
		Set<Entry<Integer,String>> StoreListKeyValueSet = StoreList.entrySet();
		System.out.println("key and value from above HashMap=" + StoreListKeyValueSet);

		// replace a HashMap value
		StoreList.replace(2,"salt");

		// keys,values from above HashMap using entry set()
		Set<Entry<Integer,String>> newStoreListKeyValueSet = StoreList.entrySet();
		System.out.println("key and value from above HashMap after remove of key=" + newStoreListKeyValueSet);

		// iterate through a HashMap
		// iterating through the key set using key set() method
		System.out.println("keys=");
		for (Integer key : StoreList.keySet()) {
			System.out.println(key);
			System.out.println(",");
			System.out.println();

			// iterate through a HashMap
			// iterating through the values using values() method
			System.out.println("values=");
			for (String values : StoreList.values()) {
				System.out.println(values);
				System.out.println(",");
				System.out.println();
			}
			System.out.println("values using set=");
			for (String values : StoreListValueSet) {
				System.out.println(values);
				System.out.println(",");
			}

			// iterate through a HashMap
			// iterating through the values using entrySet() method
			System.out.println("keys,values using entrySet=");
			for (Entry<Integer,String> hasmapdata : StoreList.entrySet()) {
				System.out.println(hasmapdata);
				System.out.println(",");
				System.out.println();
			}
			System.out.println("values using set=");
			for (Entry<Integer,String> hasmapdata : StoreListKeyValueSet) {
				System.out.println(hasmapdata);
				System.out.println(",");
			}

			// converting HashMap to TreeMap to sort the values
			Map<Integer,String> StoreListSorted = new TreeMap<Integer,String>();
			StoreListSorted.putAll(StoreList);
			System.out.println("sorted data=" + StoreListSorted);
		}

	}

}