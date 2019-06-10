package com.tirmizee.backend.api.permission.data;

import java.io.Serializable;

public class PermissionDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer perId;
	private String perName;
	private String perCode;
	private String updateBy;
	private String createBy;
	private java.sql.Date updateDate;
	private java.sql.Date createDate;
	private boolean hasPercode;
	
	public Integer getPerId() {
		return perId;
	}
	public void setPerId(Integer perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public String getPerCode() {
		return perCode;
	}
	public void setPerCode(String perCode) {
		this.perCode = perCode;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public java.sql.Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(java.sql.Date updateDate) {
		this.updateDate = updateDate;
	}
	public java.sql.Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(java.sql.Date createDate) {
		this.createDate = createDate;
	}
	public boolean isHasPercode() {
		return hasPercode;
	}
	public void setHasPercode(boolean hasPercode) {
		this.hasPercode = hasPercode;
	}

}
