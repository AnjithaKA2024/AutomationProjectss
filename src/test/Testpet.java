package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Cart;
import page.Login;
import page.Search;
import page.Signup;

public class Testpet extends Basecls{

	@BeforeTest
	public void testbefore()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void test1()
	 {
		
		Search ob=new Search(driver);
		ob.setvalues("parrot");
		
	 }
	
	@Test
	public void test2() throws IOException
	 {
		Signup ob=new Signup(driver);
		ob.setvalues();
		ob.userinfo("Anu2","123","123");
		ob.accinfo("anu", "ramdas", "anu@gmail.com", "8139852563", "pulikkal", "potta", "Thrissur", "Kerala", "xyz", "India");
		ob.proinfo("english", "DOGS");
		
		String actual=driver.getCurrentUrl();
		URL n=new URL(actual);
		HttpURLConnection con=(HttpURLConnection)n.openConnection();
		con.connect();
		System.out.println("Response code:"+con.getResponseCode());
	 }

	
	@Test
	public void test3()
	 {
		Cart ob=new Cart(driver);
		ob.setvalues("4");
	 }
	
	@Test
	public void test4()
	 {
		Login ob=new Login(driver);
		ob.setvalues("123");
		String actual1=driver.getCurrentUrl();
		
	 }
	
	@Test
	public void test() throws IOException
	{
		List<WebElement> links=driver.findElements(By.tagName("img"));
		 System.out.println("total no of links="+links.size());
		for(WebElement u:links){
			 String link=u.getAttribute("src");
			 System.out.println(link);
		}		
}
}
