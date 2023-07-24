package Esercizio_6;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class MathMethod {


        @Test
        void testSubtraction () {
            int result = Testing.subtraction(6, 2);
            TestCase.assertEquals(String.valueOf(4), result, "Il risultato è corretto");
        }

        @Test
        void maxValueSubtraction () {
            int result = Testing.subtraction(2147483647, Integer.MAX_VALUE);
            Assert.assertEquals(String.valueOf(1), result, "non superare il valore 2147483647 e il valore -2147483648 ");
        }

        @Test
        void testMultiplication () {
            int result = Testing.multiplication(5, 6);
            Assert.assertEquals(String.valueOf(30), result, "Il risultato è corretto");
        }

        @Test
        void limitMultiplication () {
            int result = Testing.multiplication(2147483647, 2);
            Assert.assertEquals(String.valueOf(429496729), result, "il risultato è 4294967294. ma non può superare ne 2147483647 ne -2147483648" +
                    " perchè non si hanno valori affidabili. Inoltre su expected ho");
        }
    }
