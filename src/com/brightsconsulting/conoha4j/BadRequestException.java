package com.brightsconsulting.conoha4j;

public class BadRequestException extends Exception {
	
	public String json;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BadRequestException(String json){
		super();
		this.json = json;
	}

}
