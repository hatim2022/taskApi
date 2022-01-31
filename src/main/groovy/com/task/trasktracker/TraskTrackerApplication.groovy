package com.task.trasktracker

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TraskTrackerApplication {

	static void main(String[] args) {
		SpringApplication.run(TraskTrackerApplication, args)
		println("server started...")
	}

}
