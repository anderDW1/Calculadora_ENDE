package interfazCLI.com;


/***
 * En esta clase se encuentran los metodos de la calculadora
 * 
 * La clase esta dise�ada de modo que tanto en CLI como en GUI se puede
 * llamar a sus metodos
 * @author ander & xabi
 *
 */

public class Calculadora {

private static float num1, num2;
	
	/**
	 * CONSTRUCTOR para la calculadora
	 * @param  num1  El par�metro num1 define el valor del elemento
	 * @author ander
	 */
	public Calculadora(){
		System.out.print("Introduzca valor para num1: ");
		num1=Consola.leeFloat();
		System.out.print("Introduzca valor para num2: "); 
		num2=Consola.leeFloat();
	}
	
	
	/**
	 * M�todo que devuelve la SUMA realizada entre num1 y num2
	 * @return Devuelve la suma 
	 * @author ander
	 */
	public static float sumar(){
		float resul=num1+num2;
		
		return resul;
	}
	
	
	/**
	 * M�todo que devuelve la RESTA realizada entre num1 y num2
	 * @return Devuelve la resta
	 * @author ander
	 */
	public static float restar(){
		float resul=num1-num2;
		
		return resul;	
	}
	
	
	/**
	 * M�todo que devuelve la MULTIPLICACION realizada entre num1 y num2
	 * @return Devuelve la suma 
	 * @author ander
	 */
	public static float multiplicar(){
		float resul=num1*num2;
		
		return resul;	
	}
	
	
	/**
	 * M�todo que devuelve la division realizada entre num1 y num2, con la excepcion de que no se pueda dividir entre 0
	 * @return Devuelve la division
	 * @author ander
	 */
	public static float dividir(){
		
		try {
			float resul=num1/num2;
		
			return resul;
		}catch(ArithmeticException e) {
			
			System.out.println("No se puede dividir entre 0");

			return -1;
		}	
	}
	
	
	/**
	 * M�todo que devuelve el EXPONENTE realizado con num1 y num2
	 * @return Devuelve el exponente
	 * @author ander
	 */
	public static float exponente(){
		
		float resul=0;
		
		for (int i=0;i<num2;i++){
			resul=num1+resul;	
		}

		return resul;
	}
	

	/**
	 * M�todo que devuelve la RAIZ CUADRADA realizada con num1
	 * @return Devuelve la raiz cuadrada
	 * @author ander
	 */
	public static float raiz_cuadrada() {
		float resul=0;
		
		return resul = (float) Math.sqrt(num1);
	}
	
	
	/**
	 * M�todo que devuelve el logaritmo realizado con num1
	 * @return Devuelve el logaritmo
	 * @author ander
	 */
	public static float logaritmo() {
		float resul=0;
		
		return resul = (float) Math.log(num1);
	}
	
	
	/**
	 * M�todo que devuelve la conversion de decimal a binario realizada con num1
	 * @return Devuelve la suma 
	 * @author ander
	 */
	public static float binario() {
		float resul=0;
		float resto=0;
		if(num1 > 0) {
			while (num1 > 0) {
                if (num1 % 2 == 0) {
                	resto=num1 % 2;
                	resul=resul+resto;
                }  
			}
			return resul; 
		}
		else{
			return -1;	
		}	
	}
	
	
	/**
	 * M�todo que devuelve el valor absoluto de un numero
	 * @return Devuelve el valor absoluto
	 * @author ander
	 */
	public static float valor_absoluto() {
		
		float resul=0;
		
		float num1_abs = Math.abs(num1);
		
		return num1_abs;
	}
	
	
}
