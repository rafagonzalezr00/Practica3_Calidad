package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Cuenta;

class CuentaTest {
	
	Cuenta cuenta1 = new Cuenta("12345", "pepe", 50);
	Cuenta cuenta2 = new Cuenta("67890", "manu", 0);

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
		cuenta1.retirar(200);
		cuenta2.retirar(350);
		cuenta1.ingresar(100);
		cuenta2.retirar(200);
		cuenta2.retirar(150);
		cuenta1.retirar(200);
		cuenta2.ingresar(50);
		cuenta1.retirar(100);
		
		System.out.println("Cuenta 1: " + cuenta1.getSaldo() + " €");
		System.out.println("Cuenta 2: " + cuenta2.getSaldo() + " €");
		
		/*Ccomprobación cuenta 1*/
		assertEquals(-250, cuenta1.getSaldo());
	}
	
	@Test
	void test0014b() {
		cuenta1.retirar(200);
		cuenta2.retirar(350);
		cuenta1.ingresar(100);
		cuenta2.retirar(200);
		cuenta2.retirar(150);
		cuenta1.retirar(200);
		cuenta2.ingresar(50);
		cuenta1.retirar(100);
		
		System.out.println("Cuenta 1: " + cuenta1.getSaldo() + " €");
		System.out.println("Cuenta 2: " + cuenta2.getSaldo() + " €");
		
		/*Ccomprobación cuenta 2*/
		assertEquals(-450, cuenta2.getSaldo());
	}

}
