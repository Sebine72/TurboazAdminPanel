package az.turbo.app.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRolesEntity {
    @Id
    private Integer id;
    private Integer userId;
    private Integer roleId;

    public Integer getId() {
        return id;
    }

    public UserRolesEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public UserRolesEntity setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public UserRolesEntity setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }
}
