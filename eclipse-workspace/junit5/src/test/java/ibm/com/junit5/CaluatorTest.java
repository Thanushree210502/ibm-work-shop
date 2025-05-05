package ibm.com.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CaluatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
		}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach class");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach class");
	}

	@Test
	void testSum() {
		int expected =6;
		Calculator calculator = new Calculator();
		int actual = calculator.sum(4,2);
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}
	@Test
	void testDivide() {
		int expected =2;
		Calculator calculator = new Calculator();
		int actual = calculator.divide(4,2);
		assertEquals(expected,actual);
		//fail("Not yet implemented");
	}
	@Test
	 void testDivideByZeroException() {
		System.out.println("divide");
		Calculator calculator = new Calculator();
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0),
				"Expected divide() to throw, but it didn't");
		assertEquals("/ by zero", exception.getMessage());
		}
	@Test
	void testSlowMethodPerformance() {
		Calculator calculator = new Calculator();
				assertTimeout(Duration.ofMillis(101),()-> calculator.getConnection());
	}
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,10})
	void testIsEvenwithEvenNumbers(int number) {
		assertTrue(Calculator.isEven(number));
	}
	
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5,7,9})
	void testIsEvenwithOddNumbers(int number) {
		assertFalse(Calculator.isEven(number));
	}
	
	}




