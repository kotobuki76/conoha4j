package com.brightsconsulting.conoha4j.api.identity;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.conoha4j.BadRequestException;
import com.brightsconsulting.conoha4j.api.identity.PostTokens;
import com.brightsconsulting.conoha4j.json.request.identity.PostTokensRequest;
import com.brightsconsulting.conoha4j.json.response.identity.PostTokensResponse;
import com.brightsconsulting.conoha4j.util.ConohaAuthLoader;
import com.brightsconsulting.conoha4j.util.ConohaTokenManager;

public class PostTokensTest {

	@Test
	public void test() {
		PostTokens postTokens = new PostTokens();
		try {
			PostTokensRequest req = new PostTokensRequest();
			req.auth = ConohaAuthLoader.loadDefault();
			PostTokensResponse postTokensResponse = postTokens.request(req);
			System.out.println(postTokensResponse.access.token.id);
			ConohaTokenManager.saveDefault(postTokensResponse.access.token);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadRequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
