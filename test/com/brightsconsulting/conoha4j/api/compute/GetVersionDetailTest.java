package com.brightsconsulting.conoha4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.conoha4j.api.compute.GetVersionDetail;
import com.brightsconsulting.conoha4j.json.common.Token;
import com.brightsconsulting.conoha4j.json.common.Version;
import com.brightsconsulting.conoha4j.json.response.compute.GetVersionDetailResponse;
import com.brightsconsulting.conoha4j.util.JsonWriter;
import com.brightsconsulting.conoha4j.util.ConohaTokenManager;

public class GetVersionDetailTest {

	@Test
	public void test() {
		Token token;

		GetVersionDetail getVersionDetail = new GetVersionDetail();
		try {
			token = ConohaTokenManager.loadDefault();
			GetVersionDetailResponse res = getVersionDetail.request(
					Version.Type.V2, token);
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
