import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calc;
	
	@Before
	public void setUp(){
		calc = new Calculadora();
		System.out.println("Antes del test");
	}
	
	@BeforeClass
	public static void setUpBeforeClass(){
		System.out.println("Antes de todo");
	}
	
	@After
	public void setUpAfter(){
		calc = null;
		System.out.println("Después del test");
	}
	
	@AfterClass
	public static void setUpAfterClass(){
		System.out.println("Después de todo");
	}
	
	@Test
	public void sumarTest() {
		double valorEsperado = 4;
		double valorReal = calc.sumar(2, 2);
		
		assertEquals(valorEsperado, valorReal, 0);
		System.out.println("sumarTest");
	}
	
	@Test
	public void restarTest() {
		double valorEsperado = 2;
		double valorReal = calc.restar(4, 2);
		
		assertEquals(valorEsperado, valorReal, 0);
		System.out.println("restarTest");
	}
	
	@Test
	public void multiplicarTest() {
		double valorEsperado = 4;
		double valorReal = calc.multiplicar(2, 2);
		
		assertEquals(valorEsperado, valorReal, 0);
		System.out.println("multiplicarTest");
	}
	
	@Test
	public void dividirTest() {
		double valorEsperado = 4;
		double valorReal = calc.dividir(8, 2);
		
		assertEquals(valorEsperado, valorReal, 0);
		System.out.println("dividirTest");
	}
	
	@Test
	public void potenciaTest(){
		double valorEsperado = 16;
		double valorReal = calc.potencia(4, 2);
		
		assertEquals(valorEsperado, valorReal, 0);
		System.out.println("potenciaTest");
	}

}
