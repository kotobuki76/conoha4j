package com.brightsconsulting.conoha4j.util;

import java.io.IOException;

import org.junit.Test;

import com.brightsconsulting.conoha4j.json.common.Auth;
import com.brightsconsulting.conoha4j.util.ConohaAuthLoader;

public class ZcomAuthLoaderTest {

	@Test
	public void test() {
		try {
			Auth auth = ConohaAuthLoader.loadDefault();
			System.out.println(auth.passwordCredentials.username);
			System.out.println(auth.passwordCredentials.password);
			System.out.println(auth.tenantId);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
