package com.brightsconsulting.conoha4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.conoha4j.api.common.APIInvoker;
import com.brightsconsulting.conoha4j.api.common.EndPoints;
import com.brightsconsulting.conoha4j.json.common.Token;
import com.brightsconsulting.conoha4j.json.response.compute.GetVmsListResponse;

/**
 * 
 * @author kotobuki76
 *
 */
public class GetVmsList extends APIInvoker {

	/**
	 * コンストラクタ
	 */
	public GetVmsList() {
		super();
	}

	/**
	 * バージョン情報取得APIの呼び出し
	 * 
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 */
	GetVmsListResponse request(Token token, String tenantId)
			throws ClientProtocolException, IOException, AuthenticationException {
		String url = EndPoints.ComputeService + "/v2/" + tenantId + "/servers";
		String json = this.getAPIClient().get(url, token);
		GetVmsListResponse resFlavors = this.getObjectMapper().readValue(json, GetVmsListResponse.class);
		return resFlavors;

	}
}
