package cn.edu.bnu.generat.entity;

import cn.edu.bnu.psaa.entity.common.BaseEntity;
import java.io.Serializable;

import javax.persistence.*;

/**
* null
*@author sun
*@Description: 
*/
@Entity
@Table(name = "notes")
public class Notes extends BaseEntity implements Serializable {

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "content", nullable = true)
	private String content;

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "module", nullable = true)
	private String module;

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "module_id", nullable = true)
	private String moduleId;

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "user_id", nullable = true)
	private String userId;

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "create_time", nullable = true)
	private java.util.Date createTime;

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "update_time", nullable = true)
	private java.util.Date updateTime;
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getModule() {
		return this.module;
	}
	
	public void setModule(String module) {
		this.module = module;
	}
	
	public String getModuleId() {
		return this.moduleId;
	}
	
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
}
