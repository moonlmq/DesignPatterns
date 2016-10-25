package com.interpreter;
public class Multiplication implements Interpreter{
	@override
	public void parse(Context context){
		if (context.getFormula().indexOf("/") != -1){
			String str = context.getFormula();
			String[] ary = str.trim().split("\\/");
			double[] numAry = new long[ary.length];
			double count = Double.parseDouble(ary[0].trim());
			for(int i =0;i<ary.length;i++){
				numAry[i] = Integer.parseInt(ary[i].trim());
				count /= numAry[i];
			}
			System.out.println(context.getFormula()+" = "+count);
		}
	}
}