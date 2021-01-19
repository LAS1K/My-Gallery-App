package pl.RL.MyGalleryApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.RL.MyGalleryApp.DAO.Picture;

@Repository
public interface PictureRepo extends CrudRepository <Picture, Long> {
}
