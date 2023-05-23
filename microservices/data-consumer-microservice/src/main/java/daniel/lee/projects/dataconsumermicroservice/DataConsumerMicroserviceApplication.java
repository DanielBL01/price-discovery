package daniel.lee.projects.dataconsumermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataConsumerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataConsumerMicroserviceApplication.class, args);
		System.out.println("This is the Data Consumer Microservice");
	}

}
