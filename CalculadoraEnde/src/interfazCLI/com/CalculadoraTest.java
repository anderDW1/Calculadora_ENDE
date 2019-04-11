package interfazCLI.com;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase de JUNIT creada para hacer pruebas sobre los métodos que vamos creando
 * Ningún método será dado por válido hasta que no tenga su JUNIT correspondiente 
 * con dos pruebas como mínimo 
 * @author Xabi, Ander
 *
 */

class CalculadoraTest {

	/**
	 *Prueba JUnit suma1 
	 *suma 2 valores y comprueba si esta bien
	 * author Xabier
	 */
	
	
	@Test
	void testSumar() {
		Calculadora calcu = new Calculadora(9,9);
		float resultado=calcu.sumar();
		assertEquals(18,resultado);	
	}
	
	/**
	 *Prueba JUnit suma2 
	 *suma 2 valores y comprueba si la suma esta bien
	 * author Xabier
	 */
	
	@Test
	void testSumar2() {
		Calculadora calcu2 = new Calculadora(5,2);
		float resultado=calcu2.sumar();
		assertNotEquals(10,resultado);	
	}
	
	/**
	 *Prueba JUnit resta 
	 *resta 2 valores y comprueba si la resta esta bien
	 * author Xabier
	 */
	
	
	@Test
	void testRestar() {
		Calculadora micalculadora = new Calculadora(5,3);
		float resultado=micalculadora.restar();
		assertNotEquals(32, resultado);
	}

	/**
	 *Prueba JUnit resta 2
	 *resta 2 valores y comprueba si la resta esta bien
	 * author Xabier
	 */
	
	@Test
	void testRestar2() {
		Calculadora micalculadora = new Calculadora(1,7);
		float resultado=micalculadora.restar();
		assertNotEquals(2, resultado);
	}
	
	
	/**
	 *Prueba JUnit Multiplicar 
	 *multiplica 2 valores y comprueba si la multiplicacion esta bien
	 * author Xabier
	 */
	
	
	@Test
	void testMultiplicar() {
		Calculadora micalculadora = new Calculadora(5,3);
		float resultado=micalculadora.multiplicar();
		assertEquals(15,resultado);;
	}

	/**
	 *Prueba JUnit Multiplicar2
	 *multiplica 2 valores y comprueba si la multiplicacion esta bien
	 * author Xabier
	 */	
	
	@Test
	void testMultiplicar2() {
		Calculadora micalculadora = new Calculadora(10,3);
		float resultado=micalculadora.multiplicar();
		assertNotEquals(34,resultado);;
	}
	
	/**
	 *Prueba JUnit Dividir
	 *divide 2 valores y comprueba si la division esta bien
	 * author Xabier
	 */	
	
	
	@Test
	void testDividir() {
		Calculadora micalculadora = new Calculadora(100,2);
		float resultado=micalculadora.dividir();
		assertEquals(50,resultado);
	}
	
	
	/**
	 *Prueba JUnit Dividir2
	 *divide 2 valores y comprueba si la division esta bien
	 * author Xabier
	 */	
	
	
	@Test
	void testDividir2() {
		Calculadora micalculadora = new Calculadora(6,2);
		float resultado=micalculadora.dividir();
		assertNotEquals(1,resultado);
	}
	
	/**
	 *Prueba JUnit Exponente
	 *divide 2 valores y comprueba si la division esta bien
	 * author Xabier
	 */	
	
	@Test
	void testExponente() {
		Calculadora micalculadora = new Calculadora(5,2);
		float resultado=micalculadora.exponente();
		assertEquals(25,resultado);
	}
	
	/**
	 *Prueba JUnit Exponente2
	 *divide 2 valores y comprueba si la division esta bien
	 * author Xabier
	 */	
	
	@Test
	void testExponente2() {
		Calculadora micalculadora = new Calculadora(5,0);
		float resultado=micalculadora.exponente();
		assertNotEquals(15,resultado);
	}
	
	/**
	 *Prueba JUnit Raiz Cuadrada
	 *divide 2 valores y comprueba si la division esta bien
	 * author Xabier
	 */	
	@Test
	void testRaiz_cuadrada() {
		Calculadora micalculadora = new Calculadora(25,0);
		float resultado=micalculadora.raiz_cuadrada();
		assertEquals(5,resultado);
	}
	
	
	/**
	 *Prueba JUnit Raiz Cuadrada2
	 *divide 2 valores y comprueba si la division esta bien
	 * author Xabier
	 */	
	@Test
	void testRaiz_cuadrada2() {
		Calculadora micalculadora = new Calculadora(5,0);
		float resultado=micalculadora.raiz_cuadrada();
		assertNotEquals(6,resultado);
	}
	
	/**
	 *Prueba JUnit Binario
	 *divide 2 valores y comprueba si la division esta bien
	 * author Xabier
	 */	
	
	@Test
	void testBinario() {
		Calculadora micalculadora = new Calculadora(5);
		String resultado=micalculadora.binario();
		assertEquals("101",resultado);
	}
	
	/**
	 *Prueba JUnit Binario2
	 *divide 2 valores y comprueba si la division esta bien
	 * author Xabier
	 */	
	
	@Test
	void testBinario2() {
		Calculadora micalculadora = new Calculadora(10);
		String resultado=micalculadora.binario();
		assertNotEquals("0000",resultado);
	}
	
	
	/**
	 *Prueba JUnit Valor Absoluto
	 *Calcula el valor absoluto de un numero y comprueba si esta bien
	 * author Xabier
	 */	
	@Test
	void testValor_absoluto() {
		Calculadora micalculadora = new Calculadora(-64,0);
		float resultado=micalculadora.valor_absoluto();
		assertEquals(64,resultado);
	}
	
	
	/**
	 *Prueba JUnit Valor Absoluto2
	 *Calcula el valor absoluto de un numero y comprueba si esta bien
	 * author Xabier
	 */	
	@Test
	void testValor_absoluto2() {
		Calculadora micalculadora = new Calculadora(9,0);
		float resultado=micalculadora.valor_absoluto();
		assertNotEquals(3,resultado);
	}

}
