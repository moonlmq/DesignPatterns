package com.state;
public class FinanceChief extends Leader{
	@override
	public void approve(Document document){
		document.setLeader(new GeneralManger());
		System.out.println("财务经理审批公文，然后送给总经理");
	}
}