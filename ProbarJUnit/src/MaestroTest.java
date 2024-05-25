
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaestroTest {

    @org.junit.jupiter.api.Test
    public void TestConstrutorMaestro(){
        Maestro maestro=new Maestro("Benito",123222);
        assertEquals("Benito", maestro.getNombre());
        assertEquals(123222, maestro.getIdentifcador());
    }
    @org.junit.jupiter.api.Test
    public void TestSetNombre(){
        Maestro maestro=new Maestro("Benito",123222);
        maestro.setNombre("Liang");
        assertEquals("Liang",maestro.getNombre());
    }

    @org.junit.jupiter.api.Test
    public void TestGetNombre(){
        Maestro maestro=new Maestro("Benito",123222);
        assertEquals("Benito",maestro.getNombre());
    }

    @org.junit.jupiter.api.Test
    public void TestSetIdentificador(){
        Maestro maestro=new Maestro("Benito",123222);
        maestro.setIdentifcador(2222);
        assertEquals(2222,maestro.getIdentifcador());
    }

    @org.junit.jupiter.api.Test
    public void TestGetIdentificador(){
        Maestro maestro=new Maestro("Benito",123222);
        assertEquals(123222,maestro.getIdentifcador());
    }

    @org.junit.jupiter.api.Test
    public void testToString() {
        Maestro maestro = new Maestro("Benito", 123222);

        String resultadoToString = maestro.toString();

        String expectedString = "Maestro{\nNombre='Benito\nIdentifcador=123222\n}";
        assertEquals(expectedString, resultadoToString);
    }

}
