import java.util.concurrent.TimeUnit;

import javax.swing.TransferHandler;

import org.apache.pdfbox.pdmodel.font.encoding.MacRomanEncoding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Thimmappa\\Desktop\\rahul\\New folder\\Downloads\\New folder\\chromedriver_win32 (2)\\chromedriver.exe\\");
			WebDriver driver=new ChromeDriver();
			driver=new ChromeDriver();
			
			
			
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			WebElement createNewAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
			createNewAccount.click();
			WebElement enterFistName=driver.findElement(By.xpath("//input[@name='firstname']"));
			enterFistName.sendKeys("bhaskar");
			WebElement enterSurName=driver.findElement(By.xpath("//input[@name='lastname']"));
			enterSurName.sendKeys("velpula");
			WebElement enterEmailId=driver.findElement(By.xpath("//input[@name='reg_email__']"));
            enterEmailId.sendKeys("Bhaskar.velpula05@gmail.com");
            WebElement reEnterEmail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
            reEnterEmail.sendKeys("Bhaskar.velpula05@gmail.com");
            WebElement enterPassoword=driver.findElement(By.xpath ("//input[@id='password_step_input']"));
            enterPassoword.sendKeys("6281542216");
            WebElement enterDate=driver.findElement(By.xpath("//select[@id='day']"));
            enterDate.sendKeys("5");
            WebElement enterManth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
            enterManth.sendKeys("may");
            WebElement enterYear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
            enterYear.sendKeys("1990");
            WebElement enterGender=driver.findElement(By.xpath("//label[text()='Male']"));
            enterGender.click();
            WebElement clickOnSingUp=driver.findElement(By.xpath("//button[@name='websubmit']"));
            clickOnSingUp.click();
         //   Thread.sleep(5000);
//            WebElement enterEmailCode=driver.findElement(By.xpath("//input[@name='code']"));
//            enterEmailCode.sendKeys("FB-14869");
//            WebElement contunewBatton=driver.findElement(By.xpath("//button[@name='confirm']"));
//            contunewBatton.click();
            
            
            driver.close();
            
            
            
		//	Tread.sleep(2000);
			
	}
}	