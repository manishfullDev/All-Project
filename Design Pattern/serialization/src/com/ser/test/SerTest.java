package com.ser.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import com.ser.bean.Product;
import com.ser.bean.Project;

public class SerTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		/*
		 * Project project = new Project(); project.setProjectNo(2);
		 * project.setDuration(34); project.setTitle("HMS"); project.setStartedDate(new
		 * Date()); System.out.println("hc : " + project.hashCode()); serialize(project,
		 * "d:\\project.ser");
		 * 
		 * Project project1 = (Project) deserialize("d:\\project.ser"); Project project2
		 * = (Project) deserialize("d:\\project.ser");
		 * 
		 * System.out.println("hc p1 : " + project1.hashCode());
		 * System.out.println("hc p2 : " + project2.hashCode());
		 */

		/*
		 * Product product = new Product(1, "Mobile", "electronics", 5999);
		 * serialize(product, "d:\\product.ser");
		 */

		/*Product product1 = (Product) deserialize("d:\\product.ser");
		System.out.println(product1);*/
		

	}

	public static void serialize(Object obj, String outFile) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = null;

		oos = new ObjectOutputStream(new FileOutputStream(outFile));
		oos.writeObject(obj);
		oos.close();
	}

	public static Object deserialize(String inFile) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream(inFile));
		return ois.readObject();
	}
}
