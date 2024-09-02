package genericUtilityOrLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * this is class is the properties class with generic functions
 * @author trive
 * @version 1.8.24
 * 
 */

public class PropertiesUtility {
	/**
	 * this is the generic method to read data from properties.
	 * 
	 */
	public   String getDataFromProperties(String data) throws Exception {
		FileInputStream fis=new FileInputStream(IconstantUtility.propertiesPath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(data);
		
		return value;
		
	}
	

}