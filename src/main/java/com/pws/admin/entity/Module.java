package com.pws.admin.entity;

import java.io.Serializable;


import org.hibernate.annotations.ColumnDefault;

import com.pws.admin.utility.AuditModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Module")
public class Module extends AuditModel implements Serializable{

	@Transient
	public static final String SEQUENCE_NAME = "user_sequence";

	@Id
	private int id;
	private Boolean isActive;
	private String name;

}
