package UTIL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {

    // Método para validar si una cadena contiene solo números
    public boolean validarNumeros(String input) {
        // Expresión regular que valida solo números
        String regex = "^[0-9]+$";
        return validarConExpresionRegular(input, regex);
    }

    // Método para validar si una cadena contiene solo caracteres (letras)
    public boolean validarCaracteres(String input) {
        // Expresión regular que valida solo letras (mayúsculas o minúsculas)
        String regex = "^[a-zA-Z]+$";
        return validarConExpresionRegular(input, regex);
    }

    // Método para validar un correo electrónico
    public boolean validarCorreoElectronico(String input) {
        // Expresión regular para validar correos electrónicos
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return validarConExpresionRegular(input, regex);
    }

    // Método para validar si una cadena contiene números y letras (alfa-numérico)
    public boolean validarAlfanumerico(String input) {
        // Expresión regular para alfa-numérico (números y letras)
        String regex = "^[a-zA-Z0-9]+$";
        return validarConExpresionRegular(input, regex);
    }

    // Método privado que valida la cadena con una expresión regular
    private boolean validarConExpresionRegular(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    // Método para validar si una cadena tiene una longitud mínima
    public boolean validarLongitudMinima(String input, int longitudMinima) {
        return input.length() >= longitudMinima;
    }

    // Método para validar si la cadena está vacía o nula
    public boolean validarVacio(String input) {
        return input != null && !input.trim().isEmpty();
    }
}
