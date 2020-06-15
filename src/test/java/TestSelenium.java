import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	
	@Test
	public void testImparto2Cursos() {
		System.setProperty("webdriver.chrome.driver", "/Users/angelisco1/Desktop/proyecto-eclipse/ejemplo-video/src/test/resources/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.es");
		WebElement inputBuscar = driver.findElement(By.name("q"));
		inputBuscar.sendKeys("Pronoide");
		inputBuscar.submit();
		
		WebElement enlacePronoide = driver.findElement(By.className("LC20lb"));
		enlacePronoide.click();
		
		assertEquals("Pronoide, formación por y para profesionales del mundo tecnológico.", driver.getTitle());
		
		WebElement enlaceCursosPublicos = driver.findElement(By.linkText("Ver calendario de cursos planificados"));
		enlaceCursosPublicos.click();
		
		List<WebElement> listaImparticiones = driver.findElements(By.linkText("Ángel Villalba"));
		
		
		assertEquals(2, listaImparticiones.size());
		
		driver.quit();
	}
	
}
