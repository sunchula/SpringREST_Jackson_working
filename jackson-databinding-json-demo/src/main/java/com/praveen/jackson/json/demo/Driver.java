package com.praveen.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			
			Student theStudent = mapper.readValue(new File("data/sample-lite.json"),Student.class);
			
			System.out.println("First Name:" +theStudent.getFirstName());
			System.out.println("Last Name:" +theStudent.getLastName());

			System.out.println("ID :" +theStudent.getId());
			System.out.println("Class, Class :" +theStudent.getClass());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
