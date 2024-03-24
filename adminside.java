package adminside;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminside {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Comsol\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bluelinetourpackage.com/main");
		Scanner on = new Scanner(System.in);
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/form/div[1]/input")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/form/div[2]/input")).sendKeys("admin");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/form/button")).click();
		driver.manage().window().maximize();
		System.out.println("LOGIN success");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbox\"]/ul[1]")).click();
		System.out.println("Select Dashboard");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbox\"]/ul[1]/li/a")).click();
		System.out.println("Select Admindetails");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbox\"]/ul[2]")).click();
		System.out.println("Select Travelpackage");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"navbox\"]/ul[2]/li[3]/a")).click();
		System.out.println("Select userdetails");
		Thread.sleep(3000);
		
		System.out.println("Name searched");
		driver.findElement(By.xpath("//*[@id=\"form1\"]")).sendKeys("athira");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/section/form/div[1]/button")).click();
		Thread.sleep(3000);
		
		System.out.println("Add USER");
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/a/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"exampleInputplace\"]")).sendKeys("lekshmy");
		driver.findElement(By.xpath("//*[@id=\"exampleInputadults\"]")).sendKeys("23456789");
		driver.findElement(By.xpath("//*[@id=\"exampleInputchildren\"]")).sendKeys("23456789");
		driver.findElement(By.xpath("//*[@id=\"exampleInputDescription\"]")).sendKeys("softwaretester");
		driver.findElement(By.xpath("//*[@id=\"exampleInputStay\"]")).sendKeys("lekshmysreekumar12@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("78905643234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div/form/button")).click();
		System.out.println("Adding successfully");
		Thread.sleep(2000);
				
		System.out.println("Logout");
		driver.findElement(By.xpath("/html/body/div[2]/nav/a")).click();
		Thread.sleep(2000);
		
		System.out.println("Add contact details");
		driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo02\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div/form/div[1]/input")).sendKeys("lekshmy");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div/form/div[2]/input")).sendKeys("lekshmy123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div/form/div[3]/input")).sendKeys("78905643206");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div/form/div[4]/textarea")).sendKeys("softwaretesting");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/div/form/div[5]/button")).click();
		Thread.sleep(500);
		System.out.println("close browser");
		 driver.quit(); 
	}

}    
