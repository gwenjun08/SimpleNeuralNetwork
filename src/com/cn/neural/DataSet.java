package com.cn.neural;

import java.util.ArrayList;
import java.util.List;

public class DataSet {
	
	private int inputCount;
	
	private int outputCount;
	
	private List<DataSetRow> rows;

	public DataSet(int inputCount, int outputCount) {
		super();
		this.inputCount = inputCount;
		this.outputCount = outputCount;
		rows = new ArrayList<DataSetRow>();
	}
	
	public void addRow(DataSetRow row) {
		if(row.getInputs().length == inputCount && row.getOutputs().length == outputCount) {
			rows.add(row);
		} else {
			throw new CustomException();
		}
	}
	
	public List<DataSetRow> getRows() {
		return rows;
	}
	
	public int getInputCount() {
		return inputCount;
	}
	
	public int getOutputCount() {
		return outputCount;
	}

}
