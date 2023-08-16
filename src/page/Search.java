package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import test.Basecls;


public class Search extends Basecls{

	WebDriver driver;
	
	By sdata=By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By link=By.xpath("//*[@id=\"BackLink\"]/a");
	
	public Search(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setvalues(String sval)
	  {
		  driver.findElement(sdata).sendKeys(sval,Keys.ENTER);
		  driver.findElement(link).click();
		  
	  }
}
