package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class project2 {

	 WebDriver driver;
	@BeforeClass
	    public void setUp() throws InterruptedException {
	        // Set up WebDriver and open the browser
	        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Comsol\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe");
	        System.out.println("launching chrome browser"); 
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://bluelinetourpackage.com/Gallery");
	        
	    }

        @Test
    public void signup() {
        	   driver.findElement(By.xpath("/html/body/nav/div/a[1]")).click() ;
          	   driver.findElement(By.xpath("//*[@id=\"exampleInputplace\"]")).sendKeys("lekshmy");
          	   driver.findElement(By.xpath("//*[@id=\"exampleInputadults\"]")).sendKeys("123456789");
          	   driver.findElement(By.xpath("//*[@id=\"exampleInputchildren\"]")).sendKeys("123456789");
          	   driver.findElement(By.xpath("//*[@id=\"exampleInputDescription\"]")).sendKeys("softwaretesting");
          	   driver.findElement(By.xpath("//*[@id=\"exampleInputStay\"]")).sendKeys("lekshmy2344@gmail.com");
          	   driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("790027288003");
          	  driver.findElement(By.xpath("/html/body/div[2]/div/form/button")).click();
          	System.out.println("SIGNUP succesfully");
          	 driver.manage().window().minimize();
        }

        @Test(priority=0)
		public void valuespassing() throws InterruptedException {
			 WebDriver driver = new ChromeDriver();
			    driver.get("https://bluelinetourpackage.com/Web/login");
			    driver.findElement(By.xpath("/html/body/center[2]/form/fieldset/input[1]")).sendKeys("lekshmiisreekumar");
        Thread.sleep(10);
        driver.findElement(By.xpath("/html/body/center[2]/form/fieldset/input[2]")).sendKeys("45465ytfgfg4654gfgdf");
        driver.findElement(By.xpath("/html/body/center[2]/form/fieldset/input[3]")).click();
    	System.out.println("LOGIN succesfully");
        driver.manage().window().minimize();
        }
        
		@Test(priority=1)
		public void validatepresenceofsubmitbutton() {
			 WebDriver driver = new ChromeDriver();
			    driver.get("https://bluelinetourpackage.com/Web/login");
        WebElement od=driver.findElement(By.xpath("/html/body/center[2]/form/fieldset/input[3]"));
        Boolean displaysubmit= od.isDisplayed();      	
    	Assert.assertTrue(displaysubmit);
    	System.out.println("Submitbutton succesfull");
		}

	    @AfterClass
	    public void closeBrowser() {
	        // Close the browser after all the test methods have executed
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	      }
	        
