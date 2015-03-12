Feature: Prueba para realizar una prueba sencilla con cucumber
 
  Scenario Outline: Operaciones 
    Given Encedemos nuestra calculadora
    When presionamos  operandoA <operandoA>
    And presionamos funcion  "<operador>"
    And presionamos operandoB <operandoB>
    
    Then El resultado final es <resultado> :
    
   Examples: 
     | operandoA | operandoB | operador  | resultado |
	 | 2         | 5         | +         | 7         |
	 | 5         | 2         | -        | 3          |
     
    
    
    
 