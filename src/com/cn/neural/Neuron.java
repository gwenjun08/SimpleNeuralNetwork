package com.cn.neural;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Neuron {
	
	private DataSet learnRule;
	
	private List<Double> ws;
	
	private double b = 0;
	
	private Transfer transfer;
	
	private boolean isReview = false;
	
	public Neuron() {
		transfer = new DuafultTransfer();
		
	}
	
	public void setLearnRule(DataSet learnRule) {
		this.learnRule = learnRule;
		if(this.learnRule != null) {
			ws = new ArrayList<>();
			Random random = new Random();
			for(int i = 0; i < this.learnRule.getInputCount(); i++) {
				double w = random.nextDouble() * 2 -1;
				ws.add(w);
			}
			learn();
		}
	}
	
	public void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}
	
	public void calculate(double[] input) {
		double result = calculateRow(input);
		
		System.out.println("结果：" + result);

	}
	
	private void learn() {
		
		if(this.learnRule != null 
				&& this.learnRule.getRows() != null 
				&& this.learnRule.getRows().size() > 0) {
			for(int i = 0; i < this.learnRule.getRows().size(); ) {
				DataSetRow row = this.learnRule.getRows().get(i);
				learnRow(row);
				i++;
				if(isReview) {
					i = 0;
					isReview = false;
				}
			}
		} else {
			throw new LearnRuleNullException();
		}

	}
	
	private double calculateRow(double[] input) {
		double result = b;
		for(int i = 0; i < ws.size(); i++) {
			System.out.println("b:" + b + ", w:" + ws.get(i) + ", p:" + input[i]);
			result += (ws.get(i) * input[i]);
		}
		
		System.out.println("result:" + transfer.transfer(result));
		return transfer.transfer(result);

	}
	
	private void learnRow(DataSetRow row) {
		
		System.out.println("learning");
		if(ws != null && row != null && row.getOutputs() != null && row.getInputs() != null
				&& row.getInputs().length == ws.size() && row.getOutputs().length > 0) {
			double result = calculateRow(row.getInputs());
			if(result != row.getOutputs()[0]) {
				isReview = true;
				error(row.getOutputs()[0] - result, row);
				learnRow(row);
			}
		}
	}
	
	private void error(double err, DataSetRow row){
		for(int i = 0; i < ws.size(); i++) {
			double wNew = ws.get(i) + (err * row.getInputs()[i]);
			ws.set(i, wNew);
		}
		
		this.b += err;
	}

}
