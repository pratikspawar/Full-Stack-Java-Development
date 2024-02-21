package _1Throws;

import java.io.File;
import java.util.Scanner;

public class Throws {
	public static void main(String[] args) throws Pratik {
		try {
			File file = new File("my_file.txt");
			if (!file.exists()) {
				throw new Pratik("Pratik File not found: my_file.txt");
			}
		} 
		catch (Pratik e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
	
