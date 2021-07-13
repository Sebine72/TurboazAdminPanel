package az.turbo.app.controller.rest;

import az.turbo.app.entity.UserEntity;
import az.turbo.app.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class RestUserController {

    private final UserRepository userRepository;

    public RestUserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public void insert(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @DeleteMapping
    public void delete(UserEntity userEntity) {
        userRepository.delete(userEntity);
    }

    @PutMapping
    public void update(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

}
