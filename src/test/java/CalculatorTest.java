
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Example test class for Jenkins integration using JUnit.
 */
@RunWith(JUnit4.class)
public class CalculatorTest {

        // A simple Calculator class to test
        static class Calculator {
                public int add(int a, int b) {
                        return a + b;
                }

                public int subtract(int a, int b) {
                        return a - b;
                }
        }

        // Instance of the class to test
        private final Calculator calculator = new Calculator();

        @Test
        public void testAddition() {
                // Test the addition method
                int result = calculator.add(2, 3);
                Assert.assertEquals("Addition test failed", 5, result);
        }

        @Test
        public void testSubtraction() {
                // Test the subtraction method
                int result = calculator.subtract(5, 3);
                Assert.assertEquals("Subtraction test failed", 2, result);
        }

        @Test
        public void testEdgeCase() {
                // Test an edge case
                int result = calculator.add(0, 0);
                Assert.assertEquals("Edge case test failed", 0, result);
        }
}




















//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.JUnit4;
//
//@RunWith(JUnit4.class)
//public class TestMp4Player {
//
//        @Test
//        public void testSample() {
//
//                Assert.assertEquals("test test failed",3, 3);
//
//
//        }
//}
