package Repo;

import java.util.List;

import javax.sound.sampled.Line;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

public interface UserRepo extends JpaRepository <User, Long> {

    /**
     * @return
     */
    List<Controller.User> findAll();

    void save(Models.User user);

    void delete(Object deleteUser);

    Object findById(long id);
    
}
