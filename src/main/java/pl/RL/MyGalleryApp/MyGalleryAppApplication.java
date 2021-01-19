package pl.RL.MyGalleryApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class MyGalleryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyGalleryAppApplication.class, args);
	}

}
