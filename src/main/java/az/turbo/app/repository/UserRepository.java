package az.turbo.app.repository;

import az.turbo.app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {


}
