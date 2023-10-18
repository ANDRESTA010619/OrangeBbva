package OrangeHrm.Definitions;

import OrangeHrm.Pages.LoginPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import OrangeHrm.Steps.Conexion;
import io.cucumber.java.en.Given;



public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();

	private LoginPage loginPage = new LoginPage(driver);

	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	@When("^the user fill out user (.*) and password (.*)")
	public void fillOutloguin(String userName, String password){
		this.loginPage = new LoginPage(driver);
		this.loginPage.fillOutLogin(userName, password);
	}
}