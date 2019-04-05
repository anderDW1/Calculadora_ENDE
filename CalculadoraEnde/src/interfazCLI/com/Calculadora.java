package interfazCLI.com;


/***
 * En esta clase se gestiona todo el sistema de cáculo de las potencias
 * y sus diferentes excepciones (si las hubiera)
 * 
 * La clase está diseñada de modo que tanto en CLI como en GUI se puede
 * llamar a sus métodos.
 * Estos últimos los diseñará el alumno
 * @author israel
 *
 */

public class Calculadora {


public class Calculadora {

	private float num1,num2;
	
	
	public Calculadora(float num1, float num2){
		this.num1=Consola.leeFloat();
		this.num2=Consola.leeFloat();
	}
	
	//SUMA
	public float sumar(){
		float resul=num1+num2;
		
		return resul;	
	}
	
	//RESTA
	public float restar(){
		float resul=num1-num2;
		
		return resul;	
	}
	
	//MULTIPLICACION
	public float multiplicar(){
		float resul=num1*num2;
		
		return resul;	
	}
	
	//DIVISION
	public float dividir(){
		
		try {
			float resul=num1/num2;
		
			return resul;
		}catch(ArithmeticException e) {
			
			System.out.println("No se puede dividir entre 0");

			return -1;
		}	
	}
	
	//EXPONENCIAL
	public float exponente(){
		
		float resul=0;
		
		for (int i=0;i<num2;i++){
			resul=num1+resul;	
		}

		return resul;
	}
	

	//RAIZ CUADRADA
	public float raiz_cuadrada() {
		float resul=0;
		
		return resul = (float) Math.sqrt(num1);
	}
	
	//LOGARITMO
	public float logaritmo() {
		float resul=0;
		
		return resul = (float) Math.log(num1);
	}
	
	//BINARIO
	public float binario() {
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
		else
		{
			return -1;
			
		}
		
	}
	
	
	//VALOR ABSOLUTO
	public float valor_absoluto() {
		
		float resul=0;
		
		float num1_abs = Math.abs(num1);
		
		return num1_abs;
	}
	
	
	
}
