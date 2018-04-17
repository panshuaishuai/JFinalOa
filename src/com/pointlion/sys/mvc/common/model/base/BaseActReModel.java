package com.pointlion.sys.mvc.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseActReModel<M extends BaseActReModel<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("ID_", id);
	}

	public java.lang.String getId() {
		return get("ID_");
	}

	public void setRev(java.lang.Integer rev) {
		set("REV_", rev);
	}

	public java.lang.Integer getRev() {
		return get("REV_");
	}

	public void setName(java.lang.String name) {
		set("NAME_", name);
	}

	public java.lang.String getName() {
		return get("NAME_");
	}

	public void setKey(java.lang.String key) {
		set("KEY_", key);
	}

	public java.lang.String getKey() {
		return get("KEY_");
	}

	public void setCategory(java.lang.String category) {
		set("CATEGORY_", category);
	}

	public java.lang.String getCategory() {
		return get("CATEGORY_");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("CREATE_TIME_", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("CREATE_TIME_");
	}

	public void setLastUpdateTime(java.util.Date lastUpdateTime) {
		set("LAST_UPDATE_TIME_", lastUpdateTime);
	}

	public java.util.Date getLastUpdateTime() {
		return get("LAST_UPDATE_TIME_");
	}

	public void setVersion(java.lang.Integer version) {
		set("VERSION_", version);
	}

	public java.lang.Integer getVersion() {
		return get("VERSION_");
	}

	public void setMetaInfo(java.lang.String metaInfo) {
		set("META_INFO_", metaInfo);
	}

	public java.lang.String getMetaInfo() {
		return get("META_INFO_");
	}

	public void setDeploymentId(java.lang.String deploymentId) {
		set("DEPLOYMENT_ID_", deploymentId);
	}

	public java.lang.String getDeploymentId() {
		return get("DEPLOYMENT_ID_");
	}

	public void setEditorSourceValueId(java.lang.String editorSourceValueId) {
		set("EDITOR_SOURCE_VALUE_ID_", editorSourceValueId);
	}

	public java.lang.String getEditorSourceValueId() {
		return get("EDITOR_SOURCE_VALUE_ID_");
	}

	public void setEditorSourceExtraValueId(java.lang.String editorSourceExtraValueId) {
		set("EDITOR_SOURCE_EXTRA_VALUE_ID_", editorSourceExtraValueId);
	}

	public java.lang.String getEditorSourceExtraValueId() {
		return get("EDITOR_SOURCE_EXTRA_VALUE_ID_");
	}

	public void setTenantId(java.lang.String tenantId) {
		set("TENANT_ID_", tenantId);
	}

	public java.lang.String getTenantId() {
		return get("TENANT_ID_");
	}

}
