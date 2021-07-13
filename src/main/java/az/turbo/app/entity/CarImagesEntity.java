package az.turbo.app.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_images")
public class CarImagesEntity {

    @Id
    private Integer id;
    private Integer carId;
    private String image;

    public Integer getId() {
        return id;
    }

    public CarImagesEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getCarId() {
        return carId;
    }

    public CarImagesEntity setCarId(Integer carId) {
        this.carId = carId;
        return this;
    }

    public String getImage() {
        return image;
    }

    public CarImagesEntity setImage(String image) {
        this.image = image;
        return this;
    }
}
