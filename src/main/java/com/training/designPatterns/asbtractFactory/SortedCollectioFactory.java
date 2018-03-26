package com.training.designPatterns.asbtractFactory;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedCollectioFactory<T, V> implements AbstractCollectionFactory<T, V>{

	public Set<T> makeSet() {
		return new TreeSet<T>(); 
	}

	public Map<T, V> makeMap() {
		return new TreeMap<T, V>();
	}
}
