package com.server.server;

import com.server.server.enumetation.Status;
import com.server.server.model.Server;
import com.server.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null,"192.168.1.160","ubuntu linux", "16 GB","personal PC",
					"https://cdn-icons-png.flaticon.com/512/438/438599.png", Status.SERVER_UP));
		};
	}
}
