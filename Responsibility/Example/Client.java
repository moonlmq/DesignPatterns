package com.chain;
public class Client{
	public static void main(String[] args){
		Leader leader11 = new SectionChief();
		Leader leader12 = new DepartmentChief();
		Leader leader13 = new FinanceChief();
		Leader leader14 = new GeneralManager();
		leader11.setLeader(leader12);
		leader12.setLeader(leader13);
		leader13.setLeader(leader14);
		//leader1.approve(bill);bill没定义，感觉有问题。
		Document document = new Document();
		document.setName("通知");
		document.setFlag("部长");
		leader11.approve(document);

	}
}