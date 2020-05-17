public class Palindromo {
    
    public static boolean esPalindromo(String palabra){
        /*
        Se crea un string llamado palabraauxiliar, lo transformamos en stringbuilder y le pasamos "palabra", ya teniendo
        almacenado la cadena de datos, lo invertimos con un .reverse() y terminamos convirtiendo este stringbuilder en
        string con un toString().
         */
        String palabraauxiliar = new StringBuilder(palabra).reverse().toString();
        //creamos un return comparando palabra y palabraauxiliar para que retorne un true o un false.
        return palabraauxiliar.equals(palabra);
    }
}
