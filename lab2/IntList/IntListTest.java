package IntList;
import static org.junit.Assert.*;
import org.junit.Test;

public class IntListTest {

    @Test
    public void addConstantTest() {
        IntList listtest = IntList.of(2,3,5,7,11);
        IntListExercises.addConstant(listtest, 1);
        IntList expected = IntList.of(3,4,6,8,12);
        assertEquals(listtest.toString(), expected.toString());
    }

    @Test
    public void setToZeroIfMaxFELTest() {
        IntList listtest = IntList.of(55,22,45,44,5);
        IntListExercises.setToZeroIfMaxFEL(listtest);
        IntList expected = IntList.of(0,22,45,0,0);
        assertEquals(listtest.toString(), expected.toString());
    }

    @Test
    public void maxTest() {
        IntList listtest = IntList.of(12,456,343,70677,1145);
        int actual = IntListExercises.max(listtest);
        int expected = 70677;
        assertEquals(actual, expected);
    }

    @Test
    public void firstDigitEqualsLastDigitTest() {
        boolean actual = IntListExercises.firstDigitEqualsLastDigit(70677);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void squarePrimesTest() {
        IntList listtest = IntList.of(3,6,7,9,11,14);
        IntListExercises.squarePrimes(listtest);
        IntList expected = IntList.of(9,6,49,9,121,14);
        assertEquals(listtest.toString(), expected.toString());
    }

}
