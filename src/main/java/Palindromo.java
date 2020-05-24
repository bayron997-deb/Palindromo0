import java.text.Normalizer;

public class Palindromo {

    public static boolean esPalindromo(String palabra){
        //Primero que nada: formateamos la cadena recibida como parametro
        palabra = formatearTexto(palabra);

        /*
        Se crea un string llamado palabraauxiliar, lo transformamos en stringbuilder y le pasamos "palabra", ya teniendo
        almacenado la cadena de datos, lo invertimos con un .reverse() y terminamos convirtiendo este stringbuilder en
        string con un toString().
         */
        String palabraauxiliar = new StringBuilder(palabra).reverse().toString();

        //finalmente en el return comparamos la palabra y palabraauxiliar para que retorne un true o un false.
        return palabraauxiliar.equalsIgnoreCase(palabra);
    }
    public static boolean esPalindromo(int numero){
        //Esto es una sobrecarga del metodo esPalindromo, con la diferencia que recibe como parametro un entero (Int)
        String numeroString = Integer.toString(numero);//Transformo el numero recibido como para parametro a String

        //Finalemte llamo al metodo original donde paso a numeroString como parametro y retorno el valor booleano de este
        return esPalindromo(numeroString);
    }
    public static boolean[] esPalindromo(String[] palindromos){
        boolean[] actual = new boolean[palindromos.length];
        for (int i = 0; i < palindromos.length; i++) {
            actual[i] = esPalindromo(palindromos[i]);
        }
        return actual;
    }
    public static boolean[] esPalindromo(int[] palindromos){
        boolean[] actual = new boolean[palindromos.length];
        for (int i = 0; i < palindromos.length; i++) {
            actual[i] = esPalindromo(palindromos[i]);
        }
        return actual;
    }
    public static String formatearTexto(String palabra){
        //Este metodo formatea la cadena, quitando los espacios, comas, guiones y acentos
        palabra = palabra.toLowerCase(); //La cadena sera en minusculas

        //Luego quitamos los espacios, guiones, comas,etc.
        String[] arregloDeSimbolos = {" ",",","-","_",";",":",".",","};
        for (String simbolo:arregloDeSimbolos) {
            palabra = palabra.replace(simbolo,"");
        }


        //A continuacion le quitamos los acentos
        palabra = stripAccents(palabra);

        return palabra;//Finalmente retornamos la palabra formateada
    }
    public static String stripAccents(String s){
        //Este metodo solamente quita los acentos de una cadena
        //Fuente: https://stackoverflow.com/a/15190787
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
}
