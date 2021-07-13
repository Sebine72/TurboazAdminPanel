package az.turbo.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {

    @Id
    private Integer id;
    private String name;
    private String surname;
    private String password;
    private Integer age;
    private String email;
    private String phone;
    private String image;

    public Integer getId() {
        return id;
    }

    public UserEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public UserEntity setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserEntity setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getImage() {
        return image;
    }

    public UserEntity setImage(String image) {
        this.image = image;
        return this;
    }
}
