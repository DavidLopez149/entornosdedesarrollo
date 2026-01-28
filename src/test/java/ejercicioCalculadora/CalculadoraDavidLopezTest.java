package ejercicioCalculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDavidLopezTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testsuma() {
        int valorEsperado = 30;

        calculadoraDavidLopez calc = new calculadoraDavidLopez(20, 10);

        int resultado = calc.suma();

        assertEquals(valorEsperado, resultado, "La suma no coincide con el valor esperado.");
    }

    @Test
    void resta() {
        int valorEsperado = 10;
        calculadoraDavidLopez calc = new calculadoraDavidLopez(20, 10);
        int resultado = calc.resta();
        assertEquals(valorEsperado, resultado, "La resta no coincide con el valor esperado.");
    }

    @Test
    void multiplica() {
        int valorEsperado = 200;
        calculadoraDavidLopez calc = new calculadoraDavidLopez(20, 10);
        int resultado = calc.multiplica();
        assertEquals(valorEsperado, resultado, "La multiplicación no coincide con el valor esperado.");
    }

    @Test
    void divide() {
        int valorEsperado = 2;
        calculadoraDavidLopez calc = new calculadoraDavidLopez(20, 10);
        int resultado = calc.divide();
        assertEquals(valorEsperado, resultado, "La división no coincide con el valor esperado.");
    }

    @Test
    public void testDivCero(){
        calculadoraDavidLopez calc = new calculadoraDavidLopez(20,0);
        assertThrows(ArithmeticException.class, () -> {
            calc.divide();
        }, "Error: no se lanzó la excepción esperada de división por cero");
    }
    @Test
    void testResta2(){
        calculadoraDavidLopez calc = new calculadoraDavidLopez(10,20);
        int valorEsperado = 10;
        int resultado = calc.resta2();
        assertEquals(valorEsperado, resultado, "La resta modificada no funciona correctamente");
    }

    @Test
    void testDivide2(){
        calculadoraDavidLopez calc = new calculadoraDavidLopez(20,0);
        int valorEsperado = 0;
        int resultado = calc.divide2();
        assertEquals(valorEsperado, resultado, "La división modificada no funciona correctamente");
    }
}
