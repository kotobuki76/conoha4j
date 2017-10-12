package com.brightsconsulting.conoha4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.conoha4j.BadRequestException;
import com.brightsconsulting.conoha4j.api.common.APIInvoker;
import com.brightsconsulting.conoha4j.api.common.EndPoints;
import com.brightsconsulting.conoha4j.json.common.Token;

/**
 * VM削除 https://cloud.z.com/sg/ja/cloud/docs/compute-delete_vm.html
 * 
 * @author kotobuki76
 * 
 */
public class DeleteVm extends APIInvoker {

	/**
	 * コンストラクタ
	 */
	public DeleteVm() {
		super();
	}

	/**
	 * VM追加APIの呼び出し
	 * 
	 * @param type
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws BadRequestException
	 */
	public void request(Token token, String serverId)
			throws ClientProtocolException, IOException, AuthenticationException, BadRequestException {

		String url = EndPoints.ComputeService + "/v2/" + token.tenant.id + "/servers/" + serverId;
		this.getAPIClient().delete(url, token);

	}
}
