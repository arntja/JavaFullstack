package stremsJava;
import java.io.*;

public class FileHandlingJava {

	public static void main(String[] args) throws Exception{
		File f = new File("demo.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("My name is Arunteja Thodishetty");
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);
	}

}
