package gameMania;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeLogin {

	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegador() {
		driver.get("http://localhost:4200/");
		driver.findElement(By.className("btn_login")).click();
		driver.findElement(By.id("email")).sendKeys("fulano@xxx.xx");
		driver.findElement(By.id("senha")).sendKeys("123456");
		driver.findElement(By.id("botao-enviar")).click();
	}			
}
