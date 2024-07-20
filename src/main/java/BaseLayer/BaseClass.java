package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	protected static Properties prop;
	protected static FileInputStream fis;
	protected static WebDriver driver;
	
	public BaseClass()
	{
		prop = new Properties();
		String path = System.getProperty("user.dir")+"/src/main/java/Configuration/config.properties";
		try 
		{
			fis = new FileInputStream(path);
			prop.load(fis);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)).pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = prop.getProperty("URL");
		driver.get(url);
	}
}
