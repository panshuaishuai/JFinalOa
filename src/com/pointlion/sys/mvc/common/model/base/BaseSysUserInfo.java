package com.pointlion.sys.mvc.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysUserInfo<M extends BaseSysUserInfo<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}

	public java.lang.String getAddress() {
		return get("address");
	}

	public void setPostCode(java.lang.String post_code) {
		set("post_code", post_code);
	}

	public java.lang.String getPostCode() {
		return get("post_code");
	}

	public void setHeight(java.lang.String height) {
		set("height", height);
	}

	public java.lang.String getHeight() {
		return get("height");
	}

	public void setWeight(java.lang.String weight) {
		set("weight", weight);
	}

	public java.lang.String getWeight() {
		return get("weight");
	}

	public void setBirthday(java.util.Date birthday) {
		set("birthday", birthday);
	}

	public java.util.Date getBirthday() {
		return get("birthday");
	}
	
	public void setBlood(java.lang.String blood) {
		set("blood", blood);
	}

	public java.lang.String getBlood() {
		return get("blood");
	}

	public void setCulture(java.lang.String culture) {
		set("culture", culture);
	}

	public java.lang.String getCulture() {
		return get("culture");
	}

	public void setFinishSchoolDate(java.util.Date finish_school_date) {
		set("finish_school_date", finish_school_date);
	}

	public java.util.Date getFinishSchoolDate() {
		return get("finish_school_date");
	}

	public void setFolk(java.lang.String folk) {
		set("folk", folk);
	}

	public java.lang.String getFolk() {
		return get("folk");
	}

	public void setGovernment(java.lang.String government) {
		set("government", government);
	}

	public java.lang.String getGovernment() {
		return get("government");
	}

	public void setHomepage(java.lang.String homepage) {
		set("homepage", homepage);
	}

	public java.lang.String getHomepage() {
		return get("homepage");
	}
	
	public void setHouseholder(java.lang.String householder) {
		set("householder", householder);
	}

	public java.lang.String getHouseholder() {
		return get("householder");
	}
	
	public void setMarriage(java.lang.String marriage) {
		set("marriage", marriage);
	}

	public java.lang.String getMarriage() {
		return get("marriage");
	}
	
	public void setMsn(java.lang.String msn) {
		set("msn", msn);
	}

	public java.lang.String getMsn() {
		return get("msn");
	}
	
	public void setNativityAddress(java.lang.String nativity_address) {
		set("nativity_address", nativity_address);
	}

	public java.lang.String getNativityAddress() {
		return get("nativity_address");
	}
	
	public void setQq(java.lang.String qq) {
		set("qq", qq);
	}

	public java.lang.String getQq() {
		return get("qq");
	}
	
	public void setSpeciality(java.lang.String speciality) {
		set("speciality", speciality);
	}

	public java.lang.String getSpeciality() {
		return get("speciality");
	}
	
	public void setDescription(java.lang.String description) {
		set("description", description);
	}

	public java.lang.String getDescription() {
		return get("description");
	}
	
	public void setVersion(java.lang.Long version) {
		set("version", version);
	}

	public java.lang.Long getVersion() {
		return get("version");
	}
	
	public void setUserId(java.lang.String user_id) {
		set("user_id", user_id);
	}

	public java.lang.String getUserId() {
		return get("user_id");
	}
}
