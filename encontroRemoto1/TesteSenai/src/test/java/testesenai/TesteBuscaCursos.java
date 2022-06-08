package testesenai;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteBuscaCursos {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	@Test
	public void testeNavegador() {
		driver.get("https://informatica.sp.senai.br");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("gestão");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}

/*	
	@Test
	public void testeNavegador() {
		driver.get("https://www.mercadolivre.com.br");
		driver.findElement(By.className("nav-search-input")).sendKeys("teclado");
		driver.findElement(By.className("nav-search-btn")).click();
	}
*/
/*	
	@Test
	public void testeNavegador() {
		driver.get("https://www.waz.com.br/");
		driver.findElement(By.className("fulltext-search-box")).sendKeys("teclado");
		driver.findElement(By.className("btn-buscar")).click();
	}	
*/	
	
}


