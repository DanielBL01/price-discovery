package daniel.lee.projects.datapublishermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataPublisherMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataPublisherMicroserviceApplication.class, args);
		System.out.println("This is the Data Publisher Microservice");
	}

}
