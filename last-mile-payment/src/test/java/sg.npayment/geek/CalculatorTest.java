package sg.npayment.geek;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Nested
    @DisplayName("Addition Tests")
    class AdditionTests {

        @Test
        @DisplayName("Should add two positive numbers")
        void testAddPositiveNumbers() {
            assertEquals(5, calculator.add(2, 3));
        }

        @Test
        @DisplayName("Should add a positive and negative number")
        void testAddPositiveAndNegativeNumber() {
            assertEquals(0, calculator.add(3, -3));
        }
    }

    @Nested
    @DisplayName("Division Tests")
    class DivisionTests {

        @Test
        @DisplayName("Should divide two positive numbers")
        void testDividePositiveNumbers() {
            assertEquals(2, calculator.divide(6, 3));
        }

        @Test
        @DisplayName("Should throw exception when dividing by zero")
        void testDivideByZero() {
            assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
        }
    }
}
