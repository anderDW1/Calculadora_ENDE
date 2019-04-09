package interfazCLI.com;

public class CalculadoraCLI {
	/**
	 * Es el programa principal de LINEA DE COMANDOS
	 * nuestra labor será extraer los métodos que haga falta y 
	 * en la medida de lo posible pasarlo a interfaz gráfico
	 * o al menos tenerlo funcionando
	 * @author ander & xabi
	 */
	
	
	private static float num1,num2;
	
	
	
	/**
	 * CONSTRUCTOR para la calculadora
	 * @param  num1  El parámetro num1 define el valor del elemento
	 * @author ander
	 */
	public CalculadoraCLI(float num1){
		System.out.println("Introduzca valor para numero1: ");
		num1=Consola.leeFloat();
	}
	
	
	/**
	 * CONSTRUCTOR para la calculadora
	 * @param  num1  El parámetro num1 define el valor del elemento 
	 * @param  num2  El parámetro num2 define el valor del elemento 
	 * @author ander
	 */
	public CalculadoraCLI(float num1, float num2){
		System.out.println("Introduzca valor para numero1: ");
		num1=Consola.leeFloat();
		System.out.println("Introduzca valor para numero1: ");
		num2=Consola.leeFloat();
	}
	
	
	
	/**
	 * Método que devuelve la SUMA realizada entre num1 y num2
	 * @return Devuelve la suma 
	 * @author ander
	 */
	private static float sumar(){
		
		float resul=num1+num2;
		
		return resul;
	}
	
	
	/**
	 * Método que devuelve la RESTA realizada entre num1 y num2
	 * @return Devuelve la resta
	 * @author ander
	 */
	private static float restar(){
		float resul=num1-num2;
		
		return resul;	
	}
	
	
	/**
	 * Método que devuelve la MULTIPLICACION realizada entre num1 y num2
	 * @return Devuelve la suma 
	 * @author ander
	 */
	private static float multiplicar(){
		float resul=num1*num2;
		
		return resul;	
	}
	
	
	/**
	 * Método que devuelve la division realizada entre num1 y num2, con la excepcion de que no se pueda dividir entre 0
	 * @return Devuelve la division
	 * @author ander
	 */
	private static float dividir(){
		
		try {
			float resul=num1/num2;
		
			return resul;
		}catch(ArithmeticException e) {
			
			System.out.println("No se puede dividir entre 0");

			return -1;
		}	
	}
	
	
	/**
	 * Método que devuelve el EXPONENTE realizado con num1 y num2
	 * @return Devuelve el exponente
	 * @author ander
	 */
	private static float exponente(){
		
		float resul=0;
		
		for (int i=0;i<num2;i++){
			resul=num1+resul;	
		}

		return resul;
	}
	

	/**
	 * Método que devuelve la RAIZ CUADRADA realizada con num1
	 * @return Devuelve la raiz cuadrada
	 * @author ander
	 */
	private static float raiz_cuadrada() {
		float resul=0;
		
		return resul = (float) Math.sqrt(num1);
	}
	
	
	/**
	 * Método que devuelve el logaritmo realizado con num1 y num2
	 * @return Devuelve el logaritmo
	 * @author ander
	 */
	private static float logaritmo() {
		float resul=0;
		
		return resul = (float) Math.log(num1);
	}
	
	
	/**
	 * Método que devuelve la conversion de decimal a binario realizada entre num1 y num2
	 * @return Devuelve la suma 
	 * @author ander
	 */
	private static float binario() {
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
	 * Método que devuelve el valor absoluto de un numero
	 * @return Devuelve el valor absoluto
	 * @author ander
	 */
	private static float valor_absoluto() {
		
		float resul=0;
		
		float num1_abs = Math.abs(num1);
		
		return num1_abs;
	}

	
	
	/**
	 * Muestra un menú de linea de comando con diferentes opciones
	 * como son meter un operador A, un operador B
	 * y realziar una operacion sobre ellos
	 * @return Devuelve un menú
	 * @author ander
	 */
	private static void LanzarMenu() {
		String respuesta;
		System.out.println("BIENVENIDO A LA CALCULADORA");
		
		do {
			System.out.println("Que operacion desea realizar?");
			System.out.println("1-SUMA" + "\n" + "2-RESTA"+"\n"+"3-MULTIPLICAR"+"\n"+"4-DIVIDIR"+"\n"+"5-EXPONENTE"+"\n"+"6-RAIZ CUADRADA"+"\n"+"7-LOGARITMO"+"\n"+"8-BINARIO"+"\n"+"9-VALOR ABSOLUTO");
			System.out.print("Introduzca su respuesta: ");
			respuesta = Consola.leeString();
			
			switch (respuesta) {
			case "SUMA": sumar();
				break;
			case "RESTA": restar();
				break;
			case "MULTIPLICAR": dividir();
				break;
			case "DIVIDIR": dividir();
				break;
			case "EXPONENTE" : exponente();
				break;
			case "RAIZ CUADRADA" : raiz_cuadrada();
				break;
			case "LOGARITMO" : logaritmo();
				break;
			case "BINARIO" : binario();
				break;
			case "VALOR ABSOLUTO" : valor_absoluto();
				break;
			}
			
			
			System.out.print("Desea finalizar la calculadora? --> Respuesta: ");
			respuesta = Consola.leeString();
			
		}while(respuesta.equalsIgnoreCase("NO"));
		
		
		 
	}

	
	public static void main(String[] args) {
		LanzarMenu();
	}


}
