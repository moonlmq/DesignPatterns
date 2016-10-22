package com.iterator;
public class Client{
	public static void main(String[] args){
		Bus bus1 = new Bus("A");
		Bus bus1 = new Bus("B");
		Bus bus1 = new Bus("C");
		BusList buslist = new BusList();
		buslist.add(bus1);
		buslist.add(bus2);
		buslist.add(bus3);
		Iterator iterator = buslist.CreateIterator();
		while(iterator.hasNext()){
			System.out.println((Bus)iterator.next().getName());
		}

	}
}