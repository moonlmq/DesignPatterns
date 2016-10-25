package com.state;
public class Context{
	public void Handle(){
		state.Handle();
	}
	public void setState(State state){
		this.state = state;
	}
	/**
	* @link aggregation
	*/
	private State state;
}