package com.cn.neural;

public class TestDemo {
	
	public static void main(String[] args) {
		Neuron neuron = new Neuron();
		DataSet learnRule = new DataSet(3, 1);
//		learnRule.addRow(new DataSetRow(new double[]{0, 0, 0}, new double[]{0}));
//		learnRule.addRow(new DataSetRow(new double[]{1, 0, 0}, new double[]{0}));
//		learnRule.addRow(new DataSetRow(new double[]{0, 1, 0}, new double[]{0}));
//		learnRule.addRow(new DataSetRow(new double[]{0, 0, 1}, new double[]{0}));
//		learnRule.addRow(new DataSetRow(new double[]{1, 1, 0}, new double[]{0}));
//		learnRule.addRow(new DataSetRow(new double[]{1, 0, 1}, new double[]{0}));
//		learnRule.addRow(new DataSetRow(new double[]{0, 1, 1}, new double[]{0}));
//		learnRule.addRow(new DataSetRow(new double[]{1, 1, 1}, new double[]{1}));
//		neuron.setLearnRule(learnRule );
//		
//		System.out.println("--------------------------------");
//		neuron.calculate(new double[]{1, 0, 0});
//		neuron.calculate(new double[]{0, 0, 0});
//		neuron.calculate(new double[]{0, 1, 0});
//		neuron.calculate(new double[]{1, 1, 1});
//		System.out.println("--------------------------------");
		
		learnRule = new DataSet(2, 1);
		learnRule.addRow(new DataSetRow(new double[]{0, 0}, new double[]{0}));
		learnRule.addRow(new DataSetRow(new double[]{0, 1}, new double[]{1}));
		learnRule.addRow(new DataSetRow(new double[]{1, 0}, new double[]{1}));
		learnRule.addRow(new DataSetRow(new double[]{1, 1}, new double[]{0}));
		neuron.setLearnRule(learnRule );
		
		System.out.println("--------------------------------");
		neuron.calculate(new double[]{1, 0});
		neuron.calculate(new double[]{0, 0});
		neuron.calculate(new double[]{0, 1});
		neuron.calculate(new double[]{1, 1});
		System.out.println("--------------------------------");
	}

}
