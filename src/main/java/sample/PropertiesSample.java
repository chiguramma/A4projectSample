package sample;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesSample {

	public static void main(String[] args) throws Exception {
     
		
		FileInputStream fis= new FileInputStream("C:\\SELENIUM//CommonData.properties");
		
		Properties pobj = new Properties();
		pobj.load(fis);
		
		String URL = pobj.getProperty("url");
		String UNAME = pobj.getProperty("usename");
		String PASS = pobj.getProperty("password");
		
		
		System.out.println(URL);
		System.out.println(UNAME);
		System.out.println(PASS);
		
		}

}
