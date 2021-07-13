package az.turbo.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "model")
public class ModelEntity {
 @Id
    private Integer id;
    private String name;
    private Integer brandId;

    public Integer getId() {
        return id;
    }

    public ModelEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModelEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public ModelEntity setBrandId(Integer brandId) {
        this.brandId = brandId;
        return this;
    }
}
