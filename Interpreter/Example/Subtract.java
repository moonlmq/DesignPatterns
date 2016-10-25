package com.interpreter;
public class Subtract implements Interpreter{
	@override
	public void parse(Context context){
		if (context.getFormula().indexOf("-") != -1){
			long[] numAry = new long[ary.length];
			int count = Integer.parseInt(ary[0].trim());
			for(int i =0;i<ary.length;i++){
				numAry[i] = Integer.parseInt(ary[i].trim());
				count -= numAry[i];
			}
			System.out.println(context.getFormula()+" = "+count);
		}
	}
}