package com.enway;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileManagementApplication.class, args);
		try {
		      FileWriter myWriter = new FileWriter("src/test/java/com/enway/prova.txt");
		      myWriter.write("Testo prova 2");
		      myWriter.close();
		      System.out.println("File successfully created and written to.");
		    } 
		catch (IOException e) {
		      System.out.println("An error occurred while creating and writing to the file.");
		      e.printStackTrace();
		    }
		
		//Modalità Append True (pospone il testo ad un file già esistente)
		//UPDATE
		try {
		      FileWriter myWriter2 = new FileWriter("src/test/java/com/enway/prova.txt", true);
		      myWriter2.write("Testo prova 2");
		      myWriter2.close();
		      System.out.println("File successfully updated.");
		    } 
		catch (IOException e) {
		      System.out.println("An error occurred while updating the file.");
		      e.printStackTrace();
		    }

		
		try {
		      FileReader fr = new FileReader("src/test/java/com/enway/prova.txt");
		      BufferedReader br = new BufferedReader(fr);
		      String line;
		      while ((line = br.readLine()) != null) {
		        System.out.println(line);
		      }
		      br.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		
		
		File file = new File("src/test/java/com/enway/prova.txt");
		if(file.delete()) {
			System.out.println("File deleted succesfully");
		}else {
			System.out.println("An error occurred during deletion");
		}
	}
	
}
	
