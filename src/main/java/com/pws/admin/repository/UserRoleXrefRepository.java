package com.pws.admin.repository;


import com.pws.admin.entity.Role;
import com.pws.admin.entity.User;
import com.pws.admin.entity.UserRoleXref;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author Vinayak M
 * @Date 10/01/23
 */

@Repository
public interface UserRoleXrefRepository extends MongoRepository<UserRoleXref, Integer> {

    @Aggregation("{ '$match': { 'role.id': ?0 } }")
    List<User> fetchAllUsersByRoleId(Integer roleId);

    @Aggregation("{ '$match': { 'role.id': ?0 } }")
    List<Role> fetchAllUsersByRole(Integer roleId);

    @Aggregation("{ '$match': { 'user.id': ?0, 'role.IsActive': true } }")
    List<Role> getActiveRolesByUserId(Integer id);
}



