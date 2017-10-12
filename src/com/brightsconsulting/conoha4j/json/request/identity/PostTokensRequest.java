package com.brightsconsulting.conoha4j.json.request.identity;

import com.brightsconsulting.conoha4j.json.common.Auth;

/**
 * 
 * @author kotobuki76
 *
 */
public class PostTokensRequest {

	/**
	 * 
	 */
	public Auth auth;

	/**
	 * 
	 */
	public PostTokensRequest() {
		this.auth = new Auth();
	}
}
