package com.memento;
//源类
public class Originator{
	public Memento getMemento(){return memento;}
	public void setMemento(Memento memento){this.memento = memento;}
	private Memento memento;
}