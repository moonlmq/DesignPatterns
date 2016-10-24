package com.chain;
public class GeneralManager extends Leader{
	@override
	public void approve(Document document){
		if("总经理".equals(document.getFlag())){
			System.out.println(document.getName()+"公文由总经理审批");
		} else if(super.getLeader() != null){
			super.getLeader().approve(document);
		}
	}
}