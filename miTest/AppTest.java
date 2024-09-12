package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    /*
    static Libro l1, l2;

    @BeforeAll public static void setUp() {
        l1 = new LibroFiccion("XYZ", "?", 500);
        l2 = new LibroProfesional("Cobol", "??", 500, 'R');
    }
*/
    @Test public void testMCD1() {
        assertTrue(CalculoDivisor.mcd(3, 9)==3);
    }

    @Test public void testMCD2() {
        assertTrue(CalculoDivisor.mcd(15, 10)==5);
    }

    @Test public void testMCD3() {
        assertTrue(CalculoDivisor.mcd(21, 7)==7);
    }
}