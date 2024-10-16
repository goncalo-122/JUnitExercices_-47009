import org.example.Number;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class test {

    private Number numberr;

    @BeforeEach
    public void setUp() {
        numberr = new Number();
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 6, 8, 10 })
    public void testIsEven(int evenNumber) {
        assertTrue(numberr.isEven(evenNumber));
    }

    @ParameterizedTest
    @ValueSource(ints = { 3, 23, 311, 487, 653, 947 })
    public void testIsPrime(int primeNumber) {
        assertTrue(numberr.isPrime(primeNumber));
    }

    @ParameterizedTest
    @CsvSource({
            "23, 1",
          "46, 2",
            "115, 5",
            "184, 8",
            "207, 3",
            "230, 10"
    })
    public  void testIsMultiple(int a,int b){
        assertTrue(numberr.isMultiple(a,b));
    }
}
