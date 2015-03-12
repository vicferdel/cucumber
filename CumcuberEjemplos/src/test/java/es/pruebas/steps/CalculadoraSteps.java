package es.pruebas.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.pruebas.bussines.Calculadora;

public class CalculadoraSteps {
private Calculadora miCalculadora;
	
	private int resultadoSuma;
	private int operando1;
	private int operando2;

	@Given("^Encendemos la calculadora$")
	public void iniciarCalculadora() throws Throwable {
	   miCalculadora=new Calculadora();
	}

	@When("^Sumamos los valores (\\d+) y (\\d+)$")
	public void testSuma(int arg1, int arg2) throws Throwable {
		operando1=arg1;
		operando2=arg2;
		resultadoSuma=miCalculadora.sumar(operando1, operando2);
	}

	@Then("^El resultado final es (\\d+)$")
	public void testResultado(int arg1) throws Throwable {
	    System.out.println("Resultado  "+operando1+" + "+operando2+" = "+resultadoSuma);
		Assert.assertEquals(arg1, resultadoSuma);
	}
}
