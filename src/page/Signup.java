package page;



import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Signup {

	WebDriver driver;
	
	By signin=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
	By signup=By.xpath("//*[@id=\"Catalog\"]/a");
	
	By userid=By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[1]/td[2]/input");
	By pswrd=By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input");
	By rpswrd=By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input");
	
	By firstname=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input");	
	By lastname=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input");	
	By email=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input");	
	By phone=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input");	
	By add1=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input");	
	By add2=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[6]/td[2]/input");	
	By city=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input");	
	By state=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input");	
	By zip=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input");
	By country=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input");
	
//	By lang=By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[1]/td[2]/select");
	By category=By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select");
	By mlist=By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input");
	By mbanner=By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input");
	By signupbtn=By.xpath("//*[@id=\"Catalog\"]/form/input");
	
	public Signup(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setvalues()
	  {
		  driver.findElement(signin).click();
		  driver.findElement(signup).click();  
	  }
	
	public void userinfo(String usid,String pwd, String repswrd)
	  {
		  driver.findElement(userid).sendKeys(usid);
		  driver.findElement(pswrd).sendKeys(pwd); 
		  driver.findElement(rpswrd).sendKeys(repswrd);
		
		  //		  driver.findElement(repswrd).sendKeys(rpwd);  

	  }
	
	public void accinfo(String fname,String lname,String em,String ph,String ad1,String ad2,String cit,String st, String zp, String cntry)
	  {
		  driver.findElement(firstname).sendKeys(fname);
		  driver.findElement(lastname).sendKeys(lname);  
		  driver.findElement(email).sendKeys(em); 
		  driver.findElement(phone).sendKeys(ph);
		  driver.findElement(add1).sendKeys(ad1);  
		  driver.findElement(add2).sendKeys(ad2); 
		  driver.findElement(city).sendKeys(cit);
		  driver.findElement(state).sendKeys(st);  
		  driver.findElement(zip).sendKeys(zp);
		  driver.findElement(country).sendKeys(cntry);  
		   
		
	  }
	
	public void proinfo(String l,String c)
	{

		  Select dropdown1 = new Select(driver.findElement(By.name("account.languagePreference")));  
		  dropdown1.selectByVisibleText(l);  
		  Select dropdown2 = new Select(driver.findElement(By.name("account.favouriteCategoryId")));  
		  dropdown2.selectByVisibleText(c);  
		  driver.findElement(mlist).click();
		  driver.findElement(mbanner).click(); 
		  driver.findElement(signupbtn).click(); 	 
		  driver.navigate().back();
		  /*
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(options);
			*/
	}
}
