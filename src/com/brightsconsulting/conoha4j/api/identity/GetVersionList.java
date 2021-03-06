package com.brightsconsulting.conoha4j.api.identity;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.conoha4j.api.common.APIInvoker;
import com.brightsconsulting.conoha4j.api.common.EndPoints;
import com.brightsconsulting.conoha4j.json.response.identity.GetVersionListResponse;

/**
 * バージョン情報取得 https://cloud.z.com/sg/ja/cloud/docs/identity-get_version_list.html
 * 
 * @author kotobuki76
 * 
 */
public class GetVersionList extends APIInvoker {

	/**
	 * コンストラクタ
	 */
	public GetVersionList() {
		super();
	}

	/**
	 * バージョン情報取得APIの呼び出し
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException 
	 */
	GetVersionListResponse request() throws ClientProtocolException,
			IOException, AuthenticationException {
		String url = EndPoints.IdentityService + "/";
		String json = this.getAPIClient().get(url);
		GetVersionListResponse resVersions = this.getObjectMapper().readValue(
				json, GetVersionListResponse.class);
		return resVersions;

	}
}
