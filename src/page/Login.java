package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login {
		WebDriver driver;
			
			By signin=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
			By username=By.name("username");
			By password=By.name("password");
			By logbtn=By.name("signon");
			
			public Login(WebDriver driver) {
				this.driver=driver;
			}
			
			public void setvalues(String pass)
			  {
				  driver.findElement(signin).click();
				  driver.findElement(password).clear();
				  driver.findElement(password).sendKeys(pass);
				  driver.findElement(logbtn).click();
			  }
}
