import java.text.Normalizer;

public class Palindromo {

    public static boolean esPalindromo(String palabra){
        /*
        Formateamos el texto, eliminando los espacios, simbolos y los acentos
        */
        palabra = formatearTexto(palabra);


        /*
        Se crea un string llamado palabraauxiliar, lo transformamos en stringbuilder y le pasamos "palabra", ya teniendo
        almacenado la cadena de datos, lo invertimos con un .reverse() y terminamos convirtiendo este stringbuilder en
        string con un toString().
         */
        System.out.println(palabra);
        String palabraauxiliar = new StringBuilder(palabra).reverse().toString();
        //creamos un return comparando palabra y palabraauxiliar para que retorne un true o un false.
        return palabraauxiliar.equalsIgnoreCase(palabra);
    }
    public static boolean esPalindromo(int numero){
        String numeroString = Integer.toString(numero);
        return esPalindromo(numeroString);

    }

    public static String formatearTexto(String palabra){
        //Este metodo formatea la cadena, quitando los espacios, comas, guiones y acentos
        palabra = palabra.replace(" ","").replace(",","").replace("-","");
        palabra = stripAccents(palabra);
        return palabra;
    }
    public static String stripAccents(String s){
        //Este metodo solamente quita los acentos de una cadena
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
}
