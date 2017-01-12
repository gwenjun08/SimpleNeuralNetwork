package com.cn.neural;

public class DataSetRow {
	
	private double[] inputs;
	
	private double[] outputs;

	public DataSetRow(double[] inputs, double[] outputs) {
		super();
		this.inputs = inputs;
		this.outputs = outputs;
	}

	public double[] getInputs() {
		return inputs;
	}

	public double[] getOutputs() {
		return outputs;
	}
	
	

}
