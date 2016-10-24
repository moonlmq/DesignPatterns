package com.chain;
public class SectionChief extends Leader{
	@override
	public void approve(Document document){
		if("处长".equals(document.getFlag())){
			System.out.println(document.getName()+"公文由处长审批");
		} else if(super.getLeader() != null){
			super.getLeader().approve(document);
		}
	}
}