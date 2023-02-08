package com.pws.admin.entity;

import java.io.Serializable;


import com.pws.admin.utility.AuditModel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "UserRoleXref")
public class UserRoleXref extends AuditModel implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";

    @Field(name = "id")
    @Id
    private Integer id;

    @DBRef
    @Field(name = "user_id")
    private User user;

    @DBRef
    @Field(name = "role_id")
    private Role role;

    @Field(name = "is_active")
    @NotBlank
    private Boolean isActive;
}
