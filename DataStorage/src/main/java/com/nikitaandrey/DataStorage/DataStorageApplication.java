package com.nikitaandrey.DataStorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataStorageApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DataStorageApplication.class, args);
		StorageAdministratorBot bot = context.getBean(StorageAdministratorBot.class);
		bot.start();
	}

}
