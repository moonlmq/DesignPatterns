package com.state;
public class GeneralManger extends Leader{
	@override
	public void approve(Document document){
		System.out.println("总经理审批公文，流程结束");
	}
}