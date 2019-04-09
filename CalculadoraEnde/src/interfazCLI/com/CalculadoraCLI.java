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

	
	
	/**
	 * Muestra un menú de linea de comando con diferentes opciones
	 * como son meter un operador A, un operador B
	 * y realziar una operacion sobre ellos
	 * @return Devuelve un menú con las distintas operaciones a poder realizar
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
			/*
			CalculadoraCLI cal = new CalculadoraCLI();
			switch (respuesta) {
			case "SUMA": System.out.println(CalculadoraCLI.sumar());
				break;
			case "RESTA": operaciones.restar();
				break;
			case "MULTIPLICAR": ;
				break;
			case "DIVIDIR": CalculadoraCLI.dividir();
				break;
			case "EXPONENTE" : CalculadoraCLI.exponente();
				break;
			case "RAIZ CUADRADA" : cal.raiz_cuadrada();
				break;
			case "LOGARITMO" : cal.logaritmo();
				break;
			case "BINARIO" : cal.binario();
				break;
			case "VALOR ABSOLUTO" : cal.valor_absoluto();
				break;
			}
			*/
			
			System.out.print("Desea finalizar la calculadora? --> Respuesta: ");
			respuesta = Consola.leeString();
			
		}while(respuesta.equalsIgnoreCase("NO"));	 
	}

	
	private static void Respuestas() {
		String suma = "Resultado de suma= " + calculadora.sumar();
	}
	
	public static void main(String[] args) {
		LanzarMenu();
	}
	


}
