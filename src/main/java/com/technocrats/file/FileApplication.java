package com.technocrats.file;

import com.technocrats.file.service.IFileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class FileApplication implements CommandLineRunner {

	@Resource
	IFileStorageService fileStorageService;

	public static void main(String[] args) {
		SpringApplication.run(FileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		fileStorageService.init();
	}
}
