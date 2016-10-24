package com.chain;
public class FinanceChief extends Leader{
	@override
	public void approve(Document document){
		if("财务经理".equals(document.getFlag())){
			System.out.println(document.getName()+"公文由财务经理审批");
		} else if(super.getLeader() != null){
			super.getLeader().approve(document);
		}
	}
}