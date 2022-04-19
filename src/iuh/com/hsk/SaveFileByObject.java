package iuh.com.hsk;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SaveFileByObject {
	public static void writeFile(Object o, String path) throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		oos.writeObject(o);
		oos.close();
	}

	public static Object readFile(String path) throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		Object o = new Object();
		o = ois.readObject();
		ois.close();
		return o;
	}
}
