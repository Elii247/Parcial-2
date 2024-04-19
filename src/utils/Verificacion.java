package utils;

import java.util.regex.Pattern;

public class Verificacion {

    public static boolean validarNombre(String nombre) {

        return Pattern.matches("^[a-zA-ZÁÉÍÓÚÑáéíóúñ\\s]{2,50}$", nombre);
    }

    public static boolean validarApellido(String apellido) {
        
        return Pattern.matches("^[a-zA-ZÁÉÍÓÚÑáéíóúñ\\s]{2,50}$", apellido);
    }

    public static boolean validarCedula(String cedula) {
        
        return Pattern.matches("^[A-Z]-[0-9]-[0-9]{1,5}-[0-9]{1,5}|[0-9]-[0-9]{1,5}-[0-9]{1,5}$", cedula);
    }

    public static boolean validarCorreo(String correo) {
        
        return Pattern.matches("^[A-Za-z0-9._%+-]+@[(G-gmail|H-hotmail|O-outlook|]+.[A-Z|a-z]{2,}$", correo);
    }

    public static boolean validarContrasena(String contrasena) {

        return Pattern.matches("^[a-zA-Z0-9._%+!#$/()=?¡-]{10}$", contrasena);
    }
}


