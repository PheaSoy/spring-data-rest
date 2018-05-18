package org.cfd.api.result;

public class ReturnResult {
	public static final int SUCCESS_CODE = 1;
	public static final int ERROR_CODE = -1;
	public static final int WARNING_CODE = -333;
	public static final int TRADE_WARNING_CODE = -334;
	public static final int SESSIONEXPIRED_CODE = -42;
	public static final int FORCE_UPGRADE = -2;
	
	private String msg;
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	private int code;
	
	public ReturnResult(){
		
		this.code = ReturnResult.SUCCESS_CODE;
		this.msg = "success";
	}
		
	public ReturnResult(int code, String msg){
		
		this.code = code;
		this.msg = msg;
	}

}
