package pl.RL.MyGalleryApp.Controller;

import org.springframework.web.bind.annotation.*;
import pl.RL.MyGalleryApp.DAO.Picture;
import pl.RL.MyGalleryApp.Manager.PictureManager;

@RestController
@RequestMapping("/api")
public class PictureController {

    private PictureManager pictureManager;

    public PictureController(PictureManager pictureManager) {
        this.pictureManager = pictureManager;
    }

    @GetMapping("/all")
    public Iterable<Picture> getAll() {
        return pictureManager.findAll();
    }

    @PostMapping
    public Picture addPicture (@RequestBody Picture picture){
        return pictureManager.save(picture);
    }




}
