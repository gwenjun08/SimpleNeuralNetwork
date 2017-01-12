package com.cn.neural;

public class DuafultTransfer implements Transfer {

	@Override
	public double transfer(double input) {
		
		if(input > 0) {
			return 1;
		}
		
		return 0;
	}

}
