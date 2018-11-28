package com.smilek.publictools.common;

import java.util.Map;

/**
 * 기본 리턴형 class
 * @author smileK
 * @Date 18.11.28
 */
public class ReturnBasic {

	/** Return Code */
	protected String code;
	/** Return Message */
	protected String message;
	/** Return시 Code, Message 이외 추가 Value 값  */
	protected Map<String, Object> extendsValue;
	
	ReturnBasic(){
		
	}
	
	ReturnBasic(String code, String message){
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getExtendsValue() {
		return extendsValue;
	}

	public void setExtendsValue(Map<String, Object> extendsValue) {
		this.extendsValue = extendsValue;
	}

	
	@Override
	public String toString() {
		return "ReturnBasic [code=" + code + ", message=" + message + ", extendsValue=" + extendsValue + "]";
	}	
}
