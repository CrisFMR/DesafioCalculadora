package cl.praxis;

import cl.praxis.models.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test clase calculadora")
public class CalculadoraTest {
    private static Logger logger = Logger.getLogger("cl.praxis.CalculadoraTest");
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void Suma(){
        int a = 9;
        int b = 3;
        logger.info("Test clase Suma");
        assertEquals(12, calculadora.suma(a,b));
    }

    @Test
    public void Resta(){
        int a = 9;
        int b = 3;
        logger.info("Test Clase Resta");
        assertEquals(6, calculadora.resta(a,b));
    }

    @Test
    public void Multiplicacion(){
        int a = 9;
        int b = 3;
        logger.info("Test Clase Multiplicación");
        assertEquals(27, calculadora.multiplicacion(a,b));
    }

    @Test
    public void Division() {
        logger.info("Test Clase División");
        int a = 9;
        int b = 3;
        assertEquals(3, calculadora.division(a, b));
    }

}
