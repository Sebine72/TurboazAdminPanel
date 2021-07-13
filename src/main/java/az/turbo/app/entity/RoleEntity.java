package az.turbo.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class RoleEntity {

    @Id
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public RoleEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RoleEntity setName(String name) {
        this.name = name;
        return this;
    }
}

