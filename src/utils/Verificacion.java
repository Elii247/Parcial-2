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
        
        return Pattern.matches("^[0-9]-[0-9]{3}-[0-9]{4}$", cedula);
    }

    public static boolean validarCorreo(String correo) {
        
        return Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", correo);
    }

    public static boolean validarContrasena(String contrasena) {

        return Pattern.matches("^[a-zA-Z0-9._%+-]{10}$", contrasena);
    }
}


