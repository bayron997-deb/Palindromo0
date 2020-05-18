import static org.junit.Assert.*;
import org.junit.*;

public class PalindromoTest {
    //instanciar clase palindromo
    private Palindromo palindromo1;
    @Before
    public void setUp() throws Exception {
        palindromo1 = new Palindromo();
    }

    @After
    public void tearDown() throws Exception {
        palindromo1 = null;
    }
    @Test
    public void esPalindromo() {
        String palindromo = "Universidad de la Frontera";
        boolean esperado = false;
        assertEquals(esperado,palindromo1.esPalindromo(palindromo));
    }
}