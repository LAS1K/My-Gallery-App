package pl.RL.MyGalleryApp.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.RL.MyGalleryApp.DAO.Picture;
import pl.RL.MyGalleryApp.Repository.PictureRepo;


@Service
public class PictureManager {

    @Autowired
    private PictureRepo pictureRepo;


    public PictureManager(PictureRepo pictureRepo) {
        this.pictureRepo = pictureRepo;
    }

    public Iterable<Picture> findAll(){
        return pictureRepo.findAll();
    }

    public Picture save (Picture picture){
        return pictureRepo.save(picture);
    }


}
