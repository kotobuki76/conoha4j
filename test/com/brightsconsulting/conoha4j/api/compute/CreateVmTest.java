package com.brightsconsulting.conoha4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.conoha4j.BadRequestException;
import com.brightsconsulting.conoha4j.json.common.SecurityGroup;
import com.brightsconsulting.conoha4j.json.common.Token;
import com.brightsconsulting.conoha4j.json.request.compute.CreateVmRequest;
import com.brightsconsulting.conoha4j.json.response.BadRequestResponse;
import com.brightsconsulting.conoha4j.json.response.compute.CreateVmResponse;
import com.brightsconsulting.conoha4j.util.JsonWriter;
import com.brightsconsulting.conoha4j.util.ConohaTokenManager;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateVmTest {

	@Test
	public void test() {
		Token token;

		CreateVm createVm = new CreateVm();
		try {
			CreateVmRequest req = new CreateVmRequest();
			req.server.imageRef = "07a8bc02-b4c1-499e-8535-28243278be4d";
			req.server.flavorRef = "7eea7469-0d85-4f82-8050-6ae742394681";
			req.server.adminPass = "1234abcdABCD!@#$";
			// res.server.key_name = "TEST";
			req.server.security_groups.add(new SecurityGroup("default"));
			req.server.security_groups.add(new SecurityGroup("gncs-ipv4-all"));
			req.server.metadata.instance_name_tag = "TEST";
			req.server.links = null;
			token = ConohaTokenManager.loadDefault();
			System.out.println(JsonWriter.toString(token));
			CreateVmResponse res = createVm.request(token, req);
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
		} catch (BadRequestException e) {

			ObjectMapper mapper = new ObjectMapper();
			try {
				BadRequestResponse badreq = mapper.readValue(e.json, BadRequestResponse.class);
				System.out.println(badreq.badRequest.message);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			e.printStackTrace();
		}
	}
}
