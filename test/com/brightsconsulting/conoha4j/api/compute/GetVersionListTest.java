package com.brightsconsulting.conoha4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.conoha4j.api.compute.GetVersionList;
import com.brightsconsulting.conoha4j.json.response.compute.GetVersionListResponse;
import com.brightsconsulting.conoha4j.util.JsonWriter;

public class GetVersionListTest {

	@Test
	public void test() {
		GetVersionList getVersions = new GetVersionList();
		try {
			GetVersionListResponse res = getVersions.request();
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
