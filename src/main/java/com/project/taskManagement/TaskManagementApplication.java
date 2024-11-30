package com.project.taskManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}

}
//Login:

//User sends a POST request to /auth/signin with email and password.
//The AuthController validates the credentials using CustomerUserServiceImplementation.
//A JWT is generated using JwtProvider and returned in an AuthResponse.
//Signup:

//User sends a POST request to /auth/signup with user details.
//The AuthController creates a new user, encodes the password, and stores it in the database.
//A JWT is generated and returned in an AuthResponse.
//Fetch User Profile:

//User sends a GET request to /api/users/profile with the JWT in the Authorization header.
//The UserServiceImplementation decodes the JWT, fetches the user profile from the database, and returns it.
//Fetch All Users:

//User sends a GET request to /api/users.
//The service retrieves and returns all users from the database.