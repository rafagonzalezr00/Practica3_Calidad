package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Cuenta;

class CuentaTest {
	
	Cuenta cuenta1 = new Cuenta("12345", "pepe", 50f);
	Cuenta cuenta2 = new Cuenta("67890", "manu", 0f);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test0014a() {
		cuenta1.retirar(200f);
		cuenta1.ingresar(100f);
		cuenta1.retirar(200f);
		
		System.out.println("Cuenta 1: " + cuenta1.getSaldo() + " €");
		
		/*Ccomprobación cuenta 1*/
		assertEquals(-250f, cuenta1.getSaldo());
	}
	
	@Test
	void test0014b() {
		cuenta2.retirar(350f);
		cuenta2.retirar(200f);
		cuenta2.retirar(150f);
		cuenta2.ingresar(50f);
		cuenta2.retirar(100f);
		
		System.out.println("Cuenta 2: " + cuenta2.getSaldo() + " €");
		
		/*Ccomprobación cuenta 2*/
		assertEquals(-750f, cuenta2.getSaldo());
	}

}
