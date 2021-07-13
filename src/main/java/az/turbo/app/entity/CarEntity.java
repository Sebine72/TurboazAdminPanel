package az.turbo.app.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name ="car")
public class CarEntity {

    @Id
    private Integer id;
    private String km;
    private String colour;
    private String description;
    private Integer cost;
    @Column(name="model_id")
    private Integer modelId;
    @Column (name="production_date")
    private LocalDate productionDate;
    @Column (name="creator_id")
    private Integer creatorId;
    @CreationTimestamp
    @Column (name="created_at")
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column (name="updated_at")
    private LocalDateTime updatedAt;

    public Integer getId() {
        return id;
    }

    public CarEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getKm() {
        return km;
    }

    public CarEntity setKm(String km) {
        this.km = km;
        return this;
    }

    public String getColour() {
        return colour;
    }

    public CarEntity setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CarEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getCost() {
        return cost;
    }

    public CarEntity setCost(Integer cost) {
        this.cost = cost;
        return this;
    }

    public Integer getModelId() {
        return modelId;
    }

    public CarEntity setModelId(Integer modelId) {
        this.modelId = modelId;
        return this;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public CarEntity setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
        return this;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public CarEntity setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public CarEntity setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public CarEntity setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
