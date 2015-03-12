package es.pruebas.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.pruebas.bussines.Calculadora;

public class CalculadoraSteps {
private Calculadora miCalculadora;
	
	private int resultadoSuma;

	@Given("^Encendemos la calculadora$")
	public void encendemos_la_calculadora() throws Throwable {
	   miCalculadora=new Calculadora();
	}

	@When("^Sumamos los valores (\\d+) y (\\d+)$")
	public void sumamos_los_valores_y(int arg1, int arg2) throws Throwable {
		resultadoSuma=miCalculadora.sumar(arg1, arg2);
	}

	@Then("^El resultado final es (\\d+)$")
	public void el_resultado_final_es(int arg1) throws Throwable {
	    Assert.assertEquals(arg1, resultadoSuma);
	}
}
