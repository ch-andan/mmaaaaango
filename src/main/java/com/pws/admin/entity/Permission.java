package com.pws.admin.entity;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.ColumnDefault;

import com.pws.admin.utility.AuditModel;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Permission")
public class Permission extends AuditModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";

	@Id
	private int id;
	

	private Boolean isActive;
	

	private Boolean isView;
	

	private Boolean isAdd;

	private Boolean isUpdate;
	

	private Boolean isDelete;

	@DBRef
	@Field(name="module_id")
	private Module module;

	@DBRef
	@Field(name="role_id")
	private Role role;
	
	

}
