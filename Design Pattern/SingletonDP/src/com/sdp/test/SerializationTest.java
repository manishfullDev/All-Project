package com.sdp.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sdp.pattern.RandomCloneable;
import com.sdp.pattern.RandomSerializable;

public class SerializationTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		RandomSerializable rc = RandomSerializable.getInstance();
		serialize(rc, "d:\\random.ser");

		RandomSerializable rc1 = (RandomSerializable) deserialize("d:\\random.ser");
		RandomSerializable rc2 = (RandomSerializable) deserialize("d:\\random.ser");
		
		System.out.println("hc rc1 : " + rc1.hashCode());
		System.out.println("hc rc2 : " + rc2.hashCode());
		
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
