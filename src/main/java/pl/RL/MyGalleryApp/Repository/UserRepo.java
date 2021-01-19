package pl.RL.MyGalleryApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.RL.MyGalleryApp.DAO.User;

@Repository
public interface UserRepo extends JpaRepository <User, Long> {

    User findByUsername(String username);
}
