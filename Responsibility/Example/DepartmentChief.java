package com.chain;
public class DepartmentChief extends Leader{
	@override
	public void approve(Document document){
		if("部长".equals(document.getFlag())){
			System.out.println(document.getName()+"公文由部长审批");
		} else if(super.getLeader() != null){
			super.getLeader().approve(document);
		}
	}
}