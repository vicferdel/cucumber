package es.pruebas.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import es.pruebas.bussines.Calculadora;

public class CalculadoraMultipleSteps {


	private static final String OPERACION_SUMA = "+";
	private static final String OPERACION_RESTA = "-";
	private Calculadora calculadora;
	private Operacion operacion;

	
	@Given("^Encedemos nuestra calculadora$")
	public void encedemos_nuestra_calculadora() throws Throwable {
	    calculadora=new Calculadora();
	    operacion=new Operacion();
	}

	@When("^presionamos  operandoA (\\d+)$")
	public void presionamos_operandoA(int arg1) throws Throwable {
		operacion.setOperando1(arg1);
	}

	@When("^presionamos funcion  \"(.*?)\"$")
	public void presionamos_funcion(String arg1) throws Throwable {
		operacion.setOperador(arg1);
	  
	}

	@When("^presionamos operandoB (\\d+)$")
	public void presionamos_operandoB(int arg1) throws Throwable {
		 operacion.setOperando2(arg1);
	}
	

	@Then("^El resultado final es (\\d+) :$")
	public void el_resultado_final_es(int resultadoEsperado) throws Throwable {
		if(OPERACION_SUMA.equals(operacion.getOperador())){
			operacion.setResultado(calculadora.sumar(operacion.getOperando1(), operacion.getOperando2()));
		    
	    }else if(OPERACION_RESTA.equals(operacion.getOperador())){
	    	operacion.setResultado(calculadora.restar(operacion.getOperando1(), operacion.getOperando2()));
	    }
		System.out.println(operacion.toString());
		Assert.assertEquals(resultadoEsperado, operacion.getResultado());
		
	}

	



}
