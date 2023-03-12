package elementos;

import org.openqa.selenium.By;

import metodos.Metodos;

public class Elementos extends Metodos {

	
	
	public By escrever = By.xpath("//*[@id=\"__next\"]/header/div[2]/nav/div[2]/div/div/form/input");

	public By pesquisa = By.xpath("//*[@id=\"__next\"]/header/div[2]/nav/div[2]/div/div/form/button");

	public By receberemcasa = By.xpath("//*[@id=\"headlessui-dialog-panel-:r9:\"]/section/article/ul/div[1]/p[1]");

	public By cep = By.xpath("//*[@id=\"headlessui-tabs-panel-:rc:\"]/div/form/input");

	
	
}
