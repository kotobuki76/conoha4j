package com.brightsconsulting.conoha4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.conoha4j.json.common.Token;
import com.brightsconsulting.conoha4j.json.response.compute.GetImagesListResponse;
import com.brightsconsulting.conoha4j.util.ConohaTokenManager;
import com.brightsconsulting.conoha4j.util.JsonWriter;

public class GetImagesListTest {

	@Test
	public void test() {
		Token token;
		GetImagesList getVersions = new GetImagesList();
		try {
			token = ConohaTokenManager.loadDefault();
			GetImagesListResponse res = getVersions.request(token, token.tenant.id);
			System.out.println(JsonWriter.toString(res));
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
