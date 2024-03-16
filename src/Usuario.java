import utils.Verificacion;

public class Usuario {
    private  String nombre;
    private  String apellido;
    private  String cedula;
    private  String correo;
    private  String contrase;

    public Usuario(String nombre, String apellido, String cedula,String correo, String contrase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.contrase = contrase;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getContrase() {
        return contrase;
    }


    public boolean validar() {
        return Verificacion.validarNombre(nombre) &&
                Verificacion.validarApellido(apellido) &&
                Verificacion.validarCedula(cedula) &&
                Verificacion.validarCorreo(correo) &&
                Verificacion.validarContrasena(contrase);
    }
}
