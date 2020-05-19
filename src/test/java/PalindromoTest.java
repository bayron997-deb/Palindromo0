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
        String[] palindromos = {"aeiéa","programacion","Anitalavalatina","Manuel","Isaac, se pesca así","Rojo, Azul, Verde"};
        boolean[] esperado = {true,false,true,false,true,false};
        boolean[] actual = palindromo1.esPalindromo(palindromos);
        assertArrayEquals(esperado,actual);
        int[] palindromosNumericos = {2002,1991,2005};
        boolean[] esperadoNumerico = {true,true,false};
        boolean[] actualNumerico = palindromo1.esPalindromo(palindromosNumericos);
        assertArrayEquals(esperadoNumerico,actualNumerico);

    }


}