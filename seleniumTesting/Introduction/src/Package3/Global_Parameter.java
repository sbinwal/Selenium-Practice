package Package3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Global_Parameter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		//Reading from the File
		FileInputStream fis = new FileInputStream("C:\\Users\\csc\\seleniumTesting\\Introduction\\src\\Data.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        prop.setProperty("browser", "firefox");
        System.out.println(prop.getProperty("browser"));
        //Writing to the file
        FileOutputStream fos = new FileOutputStream("C:\\Users\\csc\\seleniumTesting\\Introduction\\src\\Data.properties");
	    prop.store(fos, null); 
	}

}
