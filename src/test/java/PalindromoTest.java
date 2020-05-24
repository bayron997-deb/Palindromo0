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
    public void testEsPalindromo_Acento(){
        String[] palindromos = {"aeiéa","programación"};
        boolean[] esperado = {true,false};
        boolean[] actual = palindromo1.esPalindromo(palindromos);
        assertArrayEquals(esperado,actual);
    }

    @Test
    public void testEsPalindromo_AlMenosUnaMayuscula(){
        String[] palindromos = {"Anitalavalatina","Manuel"};
        boolean[] esperado = {true,false};
        boolean[] actual = palindromo1.esPalindromo(palindromos);
        assertArrayEquals(esperado,actual);


    }
    @Test
    public void testEsPalindromo_AlMenosUnSimboloOGuion() {
        String[] palindromos = {"Isaac, se pesca así","Rojo, Azul, Verde","Rojo-Azul-Verde","Isaac-se-pesca-así"};
        boolean[] esperado = {true,false,false,true};
        boolean[] actual = palindromo1.esPalindromo(palindromos);
        assertArrayEquals(esperado,actual);

    }


    @Test
    public void testEsPalindromo_Numeros(){
        int[] palindromosNumericos = {2002,1991,2005};
        boolean[] esperadoNumerico = {true,true,false};
        boolean[] actualNumerico = palindromo1.esPalindromo(palindromosNumericos);
        assertArrayEquals(esperadoNumerico,actualNumerico);

    }
    @Test
    public void testEsPalindromo_AlMenosUnEspacio(){
        String[] palindromos = {"Logre ver gol","Universidad de la Frontera"};
        boolean[] esperado = {true,false};
        boolean[] actual = palindromo1.esPalindromo(palindromos);
        assertArrayEquals(esperado,actual);

    }

}