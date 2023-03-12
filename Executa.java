package executa;


import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/feature",
		glue = "Testes",
		tags = "@teste",
		plugin = {"pretty","html:target/report-cucumber.html"},
		monochrome = true,
		dryRun = true,
		snippets = SnippetType.CAMELCASE
		
				)

public class Executa extends Drivers {

	public static void abrirNavegador() {

		String site = "https://mercado.carrefour.com.br/";
		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("start-maximized");

		driver = new ChromeDriver();
		driver.get(site);

	}

	public static void fecharNavegador() {

		driver.quit();

		
	}
	
	public static void abrirtela() {
		
		driver.manage().window().maximize();
		
		
	}
	

}
