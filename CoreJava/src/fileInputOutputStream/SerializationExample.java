package fileInputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable {
	String name;
	int age;

	SerializationExample(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Name: " + name + "Age: " + age);
	}

	public static void main(String[] args) throws IOException {
		SerializationExample se = new SerializationExample("Jagadish", 20);

		FileOutputStream fout = new FileOutputStream("xyz.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(se);
		out.flush();
		out.close();
	}
}
