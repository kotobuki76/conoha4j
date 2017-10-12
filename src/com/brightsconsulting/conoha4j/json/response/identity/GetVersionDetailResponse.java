package com.brightsconsulting.conoha4j.json.response.identity;

import com.brightsconsulting.conoha4j.json.common.Version;

/**
 * 
 * @author kotobuki76
 *
 */
public class GetVersionDetailResponse {
	
	/**
	 * 
	 */
	public Version version;
	
	/**
	 * 
	 */
	public GetVersionDetailResponse(){
		this.version = new Version();
	}
}
