package com.xworkz.Producer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Director {

	static String filename = "store.txt";

	public static void main(String[] args) {

		Producer producer = new Producer("Karan Johar",45, "Ye Dil Hai Mushkil");

		// Process of serialization

		try {
			FileOutputStream file = new FileOutputStream(filename);

			try {
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(producer);
				out.close();
				file.close();

				System.out.println(
						"Before serialization: " + producer.name + " " + producer.age + " " + Producer.movieName);

			} catch (IOException e) {

				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		// Process of deserialization

		producer = null;

		try {
			FileInputStream file = new FileInputStream(filename);

			try {

				ObjectInputStream in = new ObjectInputStream(file);

				try {

					producer = (Producer) in.readObject();
					in.close();
					file.close();

					System.out.println(
							"After serialization: " + producer.name + " " + producer.age + " " + Producer.movieName);

				} catch (ClassNotFoundException e) {

					e.printStackTrace();
				}

			} catch (IOException e) {

				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
