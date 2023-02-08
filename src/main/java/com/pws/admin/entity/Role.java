package com.pws.admin.entity;

import java.io.Serializable;

import com.pws.admin.utility.AuditModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Role")
public class Role extends AuditModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";

	@Id
	private Integer id;


	private String name;
	

	private  Boolean IsActive;
	
}
