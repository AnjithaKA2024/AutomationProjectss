package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Cart {

WebDriver driver;
	
	By cart=By.xpath("//*[@id=\"MenuContent\"]/a[1]/img");
	By add=By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[1]/input");
	By add2=By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img");
	By slct=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a");
	By crtbtn=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a");
	By qty=By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input");
	By prcdbtn=By.xpath("//*[@id=\"Cart\"]/a");	
	public Cart(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setvalues(String q)
	  {
		  driver.findElement(cart).click();
		  driver.findElement(add).click();  
		  driver.findElement(add2).click();  
		  driver.findElement(slct).click();
		  driver.findElement(crtbtn).click();
		  driver.findElement(qty).clear();
		  driver.findElement(qty).sendKeys(q,Keys.ENTER);
		  driver.findElement(prcdbtn).click();
	  }
}
