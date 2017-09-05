package com.lincao.ssm.entity.baseEntity;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: Entity
* @Description: TODO(基础实体，任何实体继承它)
* @author 曹林林
* @date 2017年9月4日 下午11:25:23
*
 */
public abstract class Entity implements Serializable{
	/**
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 1L;

	/*id作为主键*/
	private Long id;
	
	/*inputCode作为拼音输入码*/
	private String inputCode;
	
	/*创建日期*/
	private Date createDate;
	
	/*备注*/
	private String remark;
	
	/*对应的附件，例如头像等*/
	private String attachmentCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInputCode() {
		return inputCode;
	}

	public void setInputCode(String inputCode) {
		this.inputCode = inputCode;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAttachmentCode() {
		return attachmentCode;
	}

	public void setAttachmentCode(String attachmentCode) {
		this.attachmentCode = attachmentCode;
	}

}
