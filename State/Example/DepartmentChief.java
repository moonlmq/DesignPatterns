package com.state;
public class DepartmentChief extends Leader{
	@override
	public void approve(Document document){
		document.setLeader(new FinanceChief());
		System.out.println("部长审批公文，然后送给财务经理");
	}
}