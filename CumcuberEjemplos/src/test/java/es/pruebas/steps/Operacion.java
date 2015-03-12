package es.pruebas.steps;

public class Operacion {
	
	private int operando1;
	private int operando2;
	private String operador;
	private int resultado;
	
	public int getOperando1() {
		return operando1;
	}
	public void setOperando1(int operando1) {
		this.operando1 = operando1;
	}
	public int getOperando2() {
		return operando2;
	}
	public void setOperando2(int operando2) {
		this.operando2 = operando2;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public String toString(){
		return operando1+" "+operador+" " +operando2+ " = "+resultado;
	}
	


}
