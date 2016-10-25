package com.state;
public class SectionChief extends Leader{
	@override
	public void approve(Document document){
		document.setLeader(new DepartmentChief());
		System.out.println("处长审批公文，然后送给部长");
	}
}