package com.brightsconsulting.conoha4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.junit.Test;

import com.brightsconsulting.conoha4j.BadRequestException;
import com.brightsconsulting.conoha4j.api.compute.DeleteVm;
import com.brightsconsulting.conoha4j.json.common.Token;
import com.brightsconsulting.conoha4j.util.ConohaTokenManager;

public class DeleteVmTest {

	@Test
	public void test() {

		Token token;
		DeleteVm vv = new DeleteVm();
		String serverId = "37eb2b7c-38d5-4260-ab0e-0540f4c0514e";
		try {
			token = ConohaTokenManager.loadDefault();
			vv.request(token, serverId);
		} catch (AuthenticationException | IOException | BadRequestException e) {
			e.printStackTrace();
		}
	}

}
