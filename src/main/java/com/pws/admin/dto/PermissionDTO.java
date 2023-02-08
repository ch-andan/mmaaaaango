package com.pws.admin.dto;

import com.pws.admin.entity.Permission;

import lombok.Data;
@Data
public class PermissionDTO {
	
	

	 	private Integer id;

	    private Boolean isActive;

	    private Boolean isView;

	    private Boolean isAdd;
	    
	    private Boolean isUpdate;
	    
	    private Boolean isDelete;
	    
		private Integer moduleId;
		
		private Integer roleId;




}
