package com.iterator;
import java.util.ArrayList;
import java.util.List;
public class Buslist{
	private List<Bus> list = new ArrayList<Bus>();
	private int count;
	public void add(Bus bus){
		list.add(bus);
		count++;
	}
	public void remove (Bus bus){
		list.remove(bus);
		count--;

	}
	public int count(){
		return count;
	}
	public List<Bus> getList(){
		return list;
	}
	public iterator CreateIterator(){
		return new BusIterator(this);
	}
}