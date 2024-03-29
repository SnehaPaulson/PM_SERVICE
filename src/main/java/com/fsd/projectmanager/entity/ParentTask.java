package com.fsd.projectmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Parent_Task")
public class ParentTask {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Parent_ID",nullable=false)
	Integer parentId;
	
	@Column(name="Parent_Task")
	String parentTask;
	
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getParentTask() {
		return parentTask;
	}
	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}
	
	
	
}
