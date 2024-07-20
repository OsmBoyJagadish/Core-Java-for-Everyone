package fileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutPutExample {
	public static void main(String[] args) throws IOException {
//		byte b[]={32,74,65,71,65,68,73,83,72};
//		FileOutputStream f=new FileOutputStream("abc.txt");
//		FileOutputStream f=new FileOutputStream("abc.txt",true);
//		f.write(b);
//		f.close();
		
		FileInputStream f1=new FileInputStream("abc.txt");
		int i=f1.read();
		System.out.println((char)i);
		
		int n;
		while((n=f1.read())!=-1){
			System.out.println((char)n);
		}
	}
}
