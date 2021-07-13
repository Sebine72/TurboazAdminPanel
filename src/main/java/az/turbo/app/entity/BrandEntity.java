package az.turbo.app.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class BrandEntity {

    @Id
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public BrandEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BrandEntity setName(String name) {
        this.name = name;
        return this;
    }
}
