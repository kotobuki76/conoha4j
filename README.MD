# conoha4jについて
conoha4jは[ConoHa API](https://www.conoha.jp/docs/)をJava上から扱いやすくするためのライブラリです。
## JRE
Java8
## 依存ライブラリ
- Apache HttpClient 4.5.3
- Apache Jackson 2.9.0
- JUnit 4.12

# 対応しているAPI

## Identity API v2.0

### パッケージ：com.brightsconsulting.conoha4j.api.identity

|名称|クラス|
|:--|:--|
|[バージョン情報取得](https://cloud.z.com/sg/ja/cloud/docs/identity-get_version_list.html)|GetVersionList|
|[バージョン情報詳細取得](https://www.conoha.jp/docs/identity-get_version_detail.html)|GetVersionDetail|
|[トークン発行](https://www.conoha.jp/docs/identity-post_tokens.html)|PostTokens|

## Compute API v2

### パッケージ：com.brightsconsulting.conoha4j.api.compute

|名称|クラス|
|:--|:--|
|[バージョン情報取得](https://www.conoha.jp/docs/compute-get_version_list.html)|GetVersionList|
|[バージョン情報詳細取得](https://www.conoha.jp/docs/compute-get_version_detail.html)|GetVersionDetail|
|[VMプラン一覧取得](https://www.conoha.jp/docs/compute-get_flavors_list.html)|GetFlavorsList|
|[VMプラン詳細取得](https://www.conoha.jp/docs/compute-get_flavors_detail.html)|GetFlavorsDetail|
|[VM一覧取得](https://www.conoha.jp/docs/compute-get_vms_list.html)|GetVmsList|
|[VM詳細取得（アイテム指定) ](https://www.conoha.jp/docs/compute-get_vms_detail_specified.html)|GetVmsDetailSpecified|
|[VM追加](https://www.conoha.jp/docs/compute-create_vm.html)|CreateVm|
|[VM削除](https://www.conoha.jp/docs/compute-delete_vm.html)|DeleteVm|
|[イメージ一覧取得(nova) ](https://www.conoha.jp/docs/compute-get_images_list.html)|GetImagesList|
