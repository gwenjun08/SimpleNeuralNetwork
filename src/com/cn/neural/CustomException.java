package com.cn.neural;

public class CustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomException() {
		super("输入输出刺激个数不匹配！");
	}

}
