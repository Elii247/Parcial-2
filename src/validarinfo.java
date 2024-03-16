public class validarinfo {

    public validarinfo(String nombre, String apellido, float contrase, String cedula, String correo) {
    }

    public static boolean validarNombre(String nombre){
        return nombre.matches("[a-zA-Z ]{2,50}$");
    }
    public static boolean validarApellido(String apellido){
        return apellido.matches("[a-zA-Z ]{2,}");
    }

    public static boolean validarCedula(String cedula){
        return cedula.matches("\\d{10}");
    }

    public static boolean validarCorreo(String correo){
        return correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    public static boolean validarContraseña(String contrase){
        return contrase.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }

}
