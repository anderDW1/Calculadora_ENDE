package interfazCLI.com;

public class CalculadoraCLI {
	/**
	 * Es el programa principal de LINEA DE COMANDOS
	 * nuestra labor será extraer los métodos que haga falta y 
	 * en la medida de lo posible pasarlo a interfaz gráfico
	 * o al menos tenerlo funcionando
	 * @author ander & xabi
	 */
	
	
	private static Calculadora calculadora;
	private static String [] respuestas;
	
	/**
	 * Metodo que carga un array de string el cual contiene la respuesta de cada operacion
	 * @author ander
	 */
	private static void cargarArray() {
		respuestas [0] = "Resultado de la SUMA --> "+calculadora.sumar();
		respuestas [1] = "Resultado de la RESTA --> "+calculadora.restar();
		respuestas [2] = "Resultado de la MULTIPLICACION --> "+calculadora.restar();
		respuestas [3] = "Resultado de la DIVISION --> "+calculadora.dividir();
		respuestas [4] = "Resultado del EXPONENTE --> "+calculadora.exponente();
		respuestas [5] = "Resultado de la RAIZ CUADRADA --> "+calculadora.raiz_cuadrada();
		respuestas [6] = "Resultado del LOGARITMO --> "+calculadora.logaritmo();
		respuestas [7] = "Resultado de la conversion BINARIA --> "+calculadora.binario();
		respuestas [8] = "Resultado del VALOR ABSOLUTO --> "+calculadora.valor_absoluto();
	}
	
	
	
	/**
	 * Muestra un menú de linea de comando con diferentes opciones
	 * como son meter un operador A, un operador B
	 * y realziar una operacion sobre ellos
	 * @return Devuelve un menú con las distintas operaciones a poder realizar
	 * @author ander
	 */
	private static void LanzarMenu() {
		int respuesta;
		String respuestaRepetirBucle;
		System.out.println("BIENVENIDO A LA CALCULADORA");
		
		do {
			System.out.println("Que operacion desea realizar?");
			System.out.println("1-SUMA" + "\n" + "2-RESTA"+"\n"+"3-MULTIPLICAR"+"\n"+"4-DIVIDIR"+"\n"+"5-EXPONENTE"+"\n"+"6-RAIZ CUADRADA"+"\n"+"7-LOGARITMO"+"\n"+"8-BINARIO"+"\n"+"9-VALOR ABSOLUTO");
			System.out.print("Introduzca su respuesta: ");
			respuesta = Consola.leeInt();
			
			while(respuesta<1 || respuesta>9) {
				System.out.println("ERROR, introduzca una de las opciones que este dentro del menu");
				System.out.println("Que operacion desea realizar?");
				System.out.println("1-SUMA" + "\n" + "2-RESTA"+"\n"+"3-MULTIPLICAR"+"\n"+"4-DIVIDIR"+"\n"+"5-EXPONENTE"+"\n"+"6-RAIZ CUADRADA"+"\n"+"7-LOGARITMO"+"\n"+"8-BINARIO"+"\n"+"9-VALOR ABSOLUTO");
				System.out.print("Introduzca su respuesta: ");
				respuesta = Consola.leeInt();
			}
			
			CalculadoraCLI cal = new CalculadoraCLI();
			switch (respuesta) {
			case 1 :  devuelveRespuestas(1);
				break;
			case 2 : devuelveRespuestas(2);
				break;
			case 3 : devuelveRespuestas(3);
				break;
			case 4 : devuelveRespuestas(4);
				break;
			case 5 : devuelveRespuestas(5);
				break;
			case 6 : devuelveRespuestas(6);
				break;
			case 7 : devuelveRespuestas(7);
				break;
			case 8 : devuelveRespuestas(8);
				break;
			case 9 : devuelveRespuestas(9);
				break;
			}
			
			
			System.out.print("Desea finalizar la calculadora? --> Respuesta: ");
			respuestaRepetirBucle = Consola.leeString();
			
		}while(respuestaRepetirBucle.equalsIgnoreCase("NO"));	 
	}

	/**
	 * Metodo que devolvera el resultado de la operacion solicitada
	 * @param num Numero para indicar la operacion que deseamos realizar, dependiendo del numero realizaremos una operacion u otra ya que dentro de cada posiciond el array estan los metodos para realizar dichas operaciones
	 * @author ander
	 */
	private static void devuelveRespuestas(int num) {
		cargarArray();
		switch (num) {
		case 1 : System.out.println(respuestas[0]);
			break;
		case 2 : System.out.println(respuestas[1]);
			break;
		case 3 : System.out.println(respuestas[2]);
			break;
		case 4 : System.out.println(respuestas[3]);
			break;
		case 5 : System.out.println(respuestas[4]);
			break;
		case 6 : System.out.println(respuestas[5]);
			break;
		case 7 : System.out.println(respuestas[6]);
			break;
		case 8 : System.out.println(respuestas[7]);
			break;
		case 9 : System.out.println(respuestas[8]);
			break;
		}
		
		
	}
	
	public static void main(String[] args) {
		LanzarMenu();
	}
	


}
