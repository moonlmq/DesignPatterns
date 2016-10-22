package com.iterator;
public class BusIterator implements Iterator{
	private BusList list;
	private int count;
	public BusIterator(BusList list){
		this.list = list;
		this.count = list.count();
	}
	@override
	public boolean hasNext(){
		boolean flag = true;
		if (count == 0){
			flag = false;
		} else{
			flag = true;
		}
		return flag;
	}
	public Bus next(){
		Bus bus;
		bus = list.getList().get(--count);
		return bus;
	}
}