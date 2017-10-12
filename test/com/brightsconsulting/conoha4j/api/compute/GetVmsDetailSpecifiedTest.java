package com.brightsconsulting.conoha4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.conoha4j.api.compute.GetVmsDetailSpecified;
import com.brightsconsulting.conoha4j.json.common.Token;
import com.brightsconsulting.conoha4j.json.response.compute.GetVmsDetailSpecifiedResponse;
import com.brightsconsulting.conoha4j.util.JsonWriter;
import com.brightsconsulting.conoha4j.util.ConohaTokenManager;

public class GetVmsDetailSpecifiedTest {

	@Test
	public void test() {
		Token token;

		GetVmsDetailSpecified getVmsDetailSpecified = new GetVmsDetailSpecified();
		try {
			token = ConohaTokenManager.loadDefault();
			GetVmsDetailSpecifiedResponse res = getVmsDetailSpecified.request(token, token.tenant.id, "37eb2b7c-38d5-4260-ab0e-0540f4c0514e");
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
